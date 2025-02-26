public class LogLine {
    private String lvl = "";
    private String message = "";

    public LogLine(String logLine) {
        String[] afterSplit = logLine.split(":");
        this.lvl = afterSplit[0].split("[\\[\\]]")[1];
        this.message = afterSplit[1].trim();
    }

    public LogLevel getLogLevel() {
        switch (lvl) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        return this.getLogLevel().getEncodedLevel() + ":" + this.message;
    }
}
