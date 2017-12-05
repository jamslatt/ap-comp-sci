package FractionalCalculatorProject;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
        // Setup Scanner
        Scanner scanner = new Scanner(System.in);
        // Propmpt user for their calculation
        System.out.println("Enter your calculation. Allowed operators (+, -, /, *)");
        String input = scanner.nextLine();
        // Calculate...
        String result = produceAnswer(input);
        // Print secondOperand
        System.out.println("Second Operand = " + result);
    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
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

    // TODO: Fill in the space below with any helper methods that you think you will need

}