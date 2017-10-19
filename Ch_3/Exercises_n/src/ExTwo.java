public class ExTwo {
    public static void main(String[] args){
        printPowersOf2(3);
    }
    public static void printPowersOf2(int power) {
        for (int i=0;i<=power;i++) {
            System.out.print(Math.pow(2,i) + "\n");
        }
    }
}
