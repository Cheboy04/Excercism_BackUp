public class LogLevels {
    
    public static String message(String logLine) {
        int inicioMens = logLine.indexOf(':') +2;
        String Mens = logLine.substring(inicioMens);
        return Mens.trim();
    }

    public static String logLevel(String logLine) {
         int inicio = logLine.indexOf('[') +1;
         int finall = logLine.indexOf(']');
         String nivel = logLine.substring(inicio,finall).toLowerCase();
        return nivel;

    }

    public static String reformat(String logLine) {
        String messageVar = message(logLine);
        String logLevelVar = logLevel(logLine);
        return messageVar.concat(" "+'('+logLevelVar+')');
    }
}
