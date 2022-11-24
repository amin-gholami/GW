package ir.bankid.common.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;


public class HttpUtil {


    public HttpUtil() {
    }

    public static String getUserAgent() {
        RequestAttributes attribs = RequestContextHolder.getRequestAttributes();
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletRequest request = attribs != null ? ((ServletRequestAttributes) attribs).getRequest() : null;
            return Objects.requireNonNull(request).getHeader("User-Agent");
        }
        return null;
    }

    public static String getRequestHttpMethod(){
        RequestAttributes attribs = RequestContextHolder.getRequestAttributes();
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletRequest request = attribs != null ? ((ServletRequestAttributes) attribs).getRequest() : null;
            return Objects.requireNonNull(request).getMethod();
        }
        return null;
    }

    public static String getRequestUrl(){
        RequestAttributes attribs = RequestContextHolder.getRequestAttributes();
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletRequest request = attribs != null ? ((ServletRequestAttributes) attribs).getRequest() : null;
            StringBuffer requestURL = Objects.requireNonNull(request).getRequestURL();
            if (request.getQueryString() != null) {
                requestURL.append("?").append(request.getQueryString());
            }
            return requestURL.toString();
        }
        return null;
    }

    public static String getIpAddress() {
        RequestAttributes attribs = RequestContextHolder.getRequestAttributes();
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletRequest request = attribs != null ? ((ServletRequestAttributes) attribs).getRequest() : null;
            String ipAddress = Objects.requireNonNull(request).getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = Objects.requireNonNull(request).getRemoteAddr();
            }
            return ipAddress;
        }
        return null;
    }

}
