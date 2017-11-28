public class NineNTen {
    public static void main(String[] args) {
        int[] array = {9,20,39,40};

        // Ex 3
        System.out.println(min(array));

        // Ex 4
        System.out.println(precentEven(array) + "%");


    }

    public static int min(int array[]) {
        int winner = Math.abs(array[1] - array[0]);
        int slot = 0;

        for (int i = 1; i < array.length; i++) {

           int test = Math.abs(array[i] - array[slot]);
           if (test < winner)
               winner = test;

           slot++;

        }

        return winner;
    }

    public static double precentEven(int array[]) {
        int count = 0;
        for (int a : array) {
            if ((a % 2) == 0)
                count++;
        }

        return ((double)count / array.length) * 100;
    }

}
