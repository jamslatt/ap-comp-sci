public class Ex6 {
    public static void main(String[] args) {
        System.out.print(abs(2,-4));
    }
    public static int abs(int val1, int val2) {
        if (Math.abs(val1) > Math.abs(val2)) {
            return Math.abs(val1);
        }
        else {
            return Math.abs(val2);
        }
    }
}
