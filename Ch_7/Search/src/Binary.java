// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Binary {
    public static int binarySearch(int[] a, int target) {
        int min = 0;
        int max = a.length -1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (a[mid] < target) {
                min = mid + 1;
            }

        }
    }

}
