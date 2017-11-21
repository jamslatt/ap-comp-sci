import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {1,3,9,2,10,8};
        setAllToFortyTwo(array);

    }

    public static void setAllToFortyTwo(int[] array) {
        for(int chonga = 0; chonga<array.length; chonga++) {
            array[chonga] = 42;
        }
    }

    public static void max(int[] array) {
        for(int chona : array) {

        }
    }

    public static void average(int[] array) {
        int sum = 0;
        int length = array.length;
        for(int chona : array) {
            sum +=chona;
        }

        double average = sum / length;

        System.out.println("The average is: " + average);
    }

    public static void doubble(int[] array) {
        for(int chona =0; chona<array.length; chona++) {
            array[chona] = array[chona] * 2;
        }
    }

    public static void zerotothree(int[] array) {
        for(int chona =0; chona<3; chona++) {
            System.out.print("Index " + chona + " " +array[chona]);
        }
    }



    //3


    public static void range(int[] array) {
        Arrays.sort(array);

        int num = (array[array.length] - array[0]) + 1;

        System.out.println("Range is " + num);
    }


    //4


}
