public class Ex5 {
    public static void main(String[] args) {

        grid(3,10);
    }
    public static void grid(int width, int height) {
        int start = 1;
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                System.out.print(start);
                start +=height;
            }
            start = i;
            System.out.println();
        }
    }
}
