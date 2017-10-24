public class Ex7 {
    public static void main(String[] args) {
        System.out.print(abs(2,3,-4));
    }
    public static int abs(int val1, int val2, int val3) {
        if (Math.abs(val1) > Math.abs(val2) && Math.abs(val1) > Math.abs(val3)) {
            return Math.abs(val1);
        }
        else if(Math.abs(val2) > Math.abs(val1) && Math.abs(val2) > Math.abs(val3)) {
            return Math.abs(val2);
        }
        else {
            return Math.abs(val3);
        }
    }
}
