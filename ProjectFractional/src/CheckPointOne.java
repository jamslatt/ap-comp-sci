public class CheckPointOne {
    public static String produceAnswer(String str) {
        int opLoc = str.indexOf("+");
        if (opLoc == -1) {
            opLoc = str.indexOf("-");
        }
        if (opLoc == -1) {
            opLoc = str.indexOf("*");
        }
        if (opLoc == -1) {
            opLoc = str.indexOf("/");
        }

        String firstOperand = str.substring(0,opLoc);
        String secondOperand = str.substring(opLoc + 1, str.length());
        char operator = str.charAt(opLoc);


        return secondOperand;
    }
}
