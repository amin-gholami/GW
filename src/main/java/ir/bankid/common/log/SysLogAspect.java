package ir.bankid.common.log;

import ir.bankid.common.util.HttpUtil;
import ir.bankid.common.util.XSSRequestWrapper;
import lombok.NonNull;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import javax.servlet.ServletRequest;

import static ir.bankid.common.util.Utils.getGson;


@Aspect
@Component
@ComponentScan("ir.uid")
public class SysLogAspect {
    private final Logger logger = LoggerFactory.getLogger(SysLogAspect.class);


    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String buildVersion;

    public SysLogAspect() {
    }

    @Before("allControllersMethods() ")
    public void requestLogs(JoinPoint joinPoint) {
        String remoteAddress = HttpUtil.getIpAddress();
        Object[] args = joinPoint.getArgs();
        StringBuilder request = new StringBuilder();
        String userAgent = getUserAgent();
        try {
            if (args.length > 1)
                request.append(args[0].toString()).append(" ");
        } catch (Throwable e) {
            logger.warn(
                    " -- Signature: " + getLogger(joinPoint.getSignature()) +
                            " -- From: " + remoteAddress +
                            " -- Exception: " + e.getCause() + " " + e.getMessage() +
                            " -- User-Agent: " + userAgent +
                            " -- HostName: UID_CORE" +
                            " -- HTTPMethod: " + HttpUtil.getRequestHttpMethod() +
                            " -- URL: " + HttpUtil.getRequestUrl() +
                            " -- Severity: WARN" + " -- EventType: Request" +
                            " -- ApplicationName" + applicationName +
                            " -- ApplicationVersion" + buildVersion +
                            " --");

        }

        logger.info(
                " -- Signature: " + getLogger(joinPoint.getSignature()) +
                        " -- From: " + remoteAddress +
                        " -- Request body: " + request +
                        " -- User-Agent: " + userAgent +
                        " -- HostName: UID_CORE" +
                        " -- HTTPMethod: " + HttpUtil.getRequestHttpMethod() +
                        " -- URL: " + HttpUtil.getRequestUrl() +
                        " -- Severity: INFO" +
                        " -- EventType: Request" +
                        " -- ApplicationName: " + applicationName +
                        " -- ApplicationVersion: " + buildVersion +
                        " --");
    }

    private String getUserAgent() {
        String userAgent = HttpUtil.getUserAgent();
        if (userAgent == null) userAgent = "unknown";
        return userAgent;
    }

    @AfterReturning(pointcut = "allControllersMethods()", returning = "returnValue")
    public void responseLogs(JoinPoint joinPoint, Object returnValue) {
        String remoteAddress = HttpUtil.getIpAddress();
        if (returnValue != null) {
            Object[] args = joinPoint.getArgs();
            String userAgent = getUserAgent();
            String resJson = "";
            ServletRequest request = null;
            StringBuilder reqJson = new StringBuilder();
            try {
                resJson = returnValue.toString();
                if (args.length > 1)
                    reqJson.append(args[0].toString()).append(" ");
                request = getJointPointRequest(args);
                logger.info(
                        " -- Signature: " + getLogger(joinPoint.getSignature()) +
                                " -- Event: " + ((XSSRequestWrapper) request).getRequestURI().toString() + ":" +
                                " -- From: " + remoteAddress +
                                " -- Request body: " + reqJson.toString() +
                                " -- Response body: " + resJson +
                                " -- User-Agent: " + userAgent +
                                " -- HostName: UID_CORE" +
                                " -- HTTPMethod: " + HttpUtil.getRequestHttpMethod() +
                                " -- URL: " + HttpUtil.getRequestUrl() +
                                " -- Severity: INFO" +
                                " -- EventType: Response" +
                                " -- ApplicationName: " + applicationName +
                                " -- ApplicationVersion: " + buildVersion + " --");

            } catch (Throwable e) {
                logger.warn(
                        " -- Signature: " + getLogger(joinPoint.getSignature()) +
                                " -- From: " + remoteAddress +
                                " -- Exception: " + e.getCause() + " " + e.getMessage() +
                                " -- User-Agent: " + userAgent +
                                " -- HostName: UID_CORE" +
                                " -- HTTPMethod: " + HttpUtil.getRequestHttpMethod() +
                                " -- URL: " + HttpUtil.getRequestUrl() +
                                " -- Severity: WARN" +
                                " -- EventType: Response" +
                                " -- ApplicationName: " + applicationName +
                                " -- ApplicationVersion: " + buildVersion +
                                " --");
            }
        }
    }

    @AfterThrowing(pointcut = "allControllersMethods()", throwing = "ex")
    public void exceptionLogs(JoinPoint joinPoint, Throwable ex) {
        String remoteAddress = HttpUtil.getIpAddress();
        Object[] args = joinPoint.getArgs();
        ServletRequest request = null;
        StringBuilder requestBody = new StringBuilder();
        try {
            if (args.length > 1)
                requestBody.append(getGson().toJson(args[0])).append(" ");
            if(ex.getMessage().contains("Broken"))
                return;
            request = getJointPointRequest(args);
            logger.error(
                    " -- Signature: " + getLogger(joinPoint.getSignature()) +
                            " -- Event: " + ((XSSRequestWrapper) request).getRequestURI().toString() + ":" +
                            " -- From: " + remoteAddress +
                            " -- UserAgent: " + getUserAgent() +
                            " -- HostName: UID_CORE" +
                            " -- HTTPMethod: " + HttpUtil.getRequestHttpMethod() +
                            " -- Request body : " + requestBody.toString() +
                            " -- URL: " + HttpUtil.getRequestUrl() +
                            " -- Severity: ERROR" +
                            " -- EventType: Exception" +
                            " -- ApplicationName: " + applicationName +
                            " -- ApplicationVersion: " + buildVersion +
                            " -- Exception: {message: " + ex.getMessage() + "\"stacktrace\" : " + getGson().toJson(ex.getStackTrace()[0]) + "}");
        } catch (Exception exception) {
            logger.error(" SysLogAspect Class -> exceptionLogs method : request is null " + exception.toString());
        }
    }

    @Pointcut("execution(* ir.bankid.keycloak.controller..*.*(..))"
            + "&& !@annotation(ir.bankid.common.util.IgnoreMethodLog)"
            + "&& !@target(ir.bankid.common.util.IgnoreMethodLog)")
    public void allControllersMethods() {
    }

    private String getLogger(Signature signature) {
        String logger = signature.toString().split(" ")[1];
        logger = logger.split("\\(")[0];
        return logger;
    }

    private ServletRequest getJointPointRequest(@NonNull Object[] joinpoint) {
        int requestIndex = joinpoint.length - 1;
        return (ServletRequest) joinpoint[requestIndex];
    }


}
