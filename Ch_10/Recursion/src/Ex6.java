// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Ex6 {
    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print(1);
        } else if (n % 2 != 0) {
            System.out.print(n * n + ", ");
            writeSquares(n - 2);
            System.out.print(", " + (n - 1) * (n - 1));
        } else {
            System.out.print((n - 1) * (n - 1));
            if (n != 2) {
                System.out.print(", ");
                writeSquares(n - 2);
            }
            System.out.print(", " + n * n);
        }
    }
}
