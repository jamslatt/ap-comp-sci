// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Linear {
    public static boolean search(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;

            }
        }
        return false;
    }
}
