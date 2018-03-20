// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Ex2 {
    public static void main(String[] args) {
        System.out.print(writeNums(5));
    }

    public static String writeNums(int n) {
        if (n <= 1)
            return Integer.toString(n);
        else
            return writeNums(n - 1) + ", " + n;
    }

}
