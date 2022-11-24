package ir.bankid.common.log;

public enum LogFileName {
    SOC_LOG("socLog");

    private String logFileName;

    LogFileName(String fileName) {
        this.logFileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public static LogFileName getAwardTypeEnum(String value) {
        LogFileName[] arr = values();
        for (LogFileName item : arr) {
            if (null != item && !item.logFileName.equals("")) {
                return item;
            }
        }
        return null;
    }
}
