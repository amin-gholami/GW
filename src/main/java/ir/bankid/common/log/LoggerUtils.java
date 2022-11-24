package ir.bankid.common.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
    public static <T> Logger Logger(Class<T> clazz) {
        return  LoggerFactory.getLogger(clazz);
    }

    /**
     * Print to the specified file
     *
     * @param desc Log file name
     * @return
     */
    public static Logger Logger(LogFileName desc) {
        return  LoggerFactory.getLogger(desc.getLogFileName());
    }
}
