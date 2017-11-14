import java.util.Scanner;

public class Main extends CheckPointOne {
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
}
