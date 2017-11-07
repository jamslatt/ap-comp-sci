import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        double total = 0;

        int item = scanner.nextInt();

        for (int i = 1; i<=item ; i++) {
            System.out.println("Item #" + i + ":");
            double next = scanner.nextDouble();
            total += next;
        }
        System.out.println(total);
    }
}
