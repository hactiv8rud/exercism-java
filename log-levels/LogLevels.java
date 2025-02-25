public class LogLevels {

    public static String message(String logLine) {
//        return logLine.replaceAll("^\\[(.+)]:\\s*((\\w+\\s\\w+)*|\\w+)([\\s\\r\\n])*$", "$2");
       return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
//        return logLine.replaceAll("^\\[(.+)]:\\s*((\\w+\\s\\w+)*|\\w+)([\\s\\r\\n])*$", "$1").toLowerCase();
        return logLine.split(":")[0].split("[\\[\\]]")[1].toLowerCase();
    }

    public static String reformat(String logLine) {
//        return String.format("%s (%s)", message(logLine), logLevel(logLine));
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
