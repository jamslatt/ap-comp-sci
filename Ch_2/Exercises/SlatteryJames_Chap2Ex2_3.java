//////////////////////
// Chapter 2 Ex 2&3 //
// James Slattery   //
//////////////////////

public class SlatteryJames_Chap2Ex2_3 {
    public static void main(String [] args) {
        two();
        three();
    }
    
    // Static Method for Ex 2
    public static void two() {
        // Loop that runs 10 times
        for (int i=1; i<= 10; i++) {
            // Sets variable f to i to the power of two
            int f = (int)Math.pow(i, 2);
            // Prints f value to console
            System.out.println(f);
        }
    }

    public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void three() {
        for (int i=1; i<=12; i++) {
            System.out.println(fib(i));
        }
    }
}
