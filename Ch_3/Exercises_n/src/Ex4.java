public class Ex4 {
    public static void main(String[] args) {
        printSquare(3,10);
    }

    public static void printSquare(int inital, int fin) {
        int[] db = new int[inital];
        for (; inital<=fin; inital++) {
            db[inital] = inital;
        }
    }
}
