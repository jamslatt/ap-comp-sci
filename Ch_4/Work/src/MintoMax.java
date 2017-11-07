import java.util.Scanner;
public class MintoMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int item = scanner.nextInt();
        int val = 0;

        int nums[] = new int[item];



        for (int i = 0; i<item ; i++) {
            System.out.println("Item #" + i + ":");
            int next = scanner.nextInt();
            nums[i] = next;

        }

        for (int j = 1; j<=nums.length; j++) {
            val = nums[0];
            if (nums[j] > val ) {
                val = nums[j];
            }
        }


        System.out.println("Max value is " + val + ".");

    }
}
