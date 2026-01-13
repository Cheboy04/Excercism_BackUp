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
         int inicioNivel = logLine.indexOf('[') +1;
         int finalNivel = logLine.indexOf(']');
         int inicioMens = logLine.indexOf(':') +2;
         String nivel = logLine.substring(inicioNivel,finalNivel).toLowerCase().trim();
         String Mens = logLine.substring(inicioMens).trim();
        return Mens.concat(" "+'('+nivel+')');
    }
}
