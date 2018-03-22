// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Ex5 {
    public static void main(String[] args) {
        int input = 44;

        System.out.print("f(" + input + ") = " );
        writeBin(input);
    }

    public static void writeBin(int i) {
        if (i>0) {
            writeBin(i/2);
            System.out.print(i%2);
        }
    }
}
