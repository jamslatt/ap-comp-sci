// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Tower {
        // Set disc amt
        public static final int discs = 3;

        public static void main(String[] args) {
            // Intro
            System.out.println("This program solves the Towers of Hanoi puzzle.\nYou specify how many disks to put initally on\nTower A and I will tell you a series of moves to\nget tem all to tower B.");
            solve(discs, "A", "B", "C");
        }

        public static void solve(int n, String a, String b, String c) {
            // Base Case (if only 1 block)
            if (n == 1) {
                System.out.println("Move disk from " + a + " to " + c);
            }
            // If not one block then
            else {
                // Inital Push
                solve(n - 1, a, c, b);
                System.out.println("Move disk from " + a + " to " + c);
                // Secondary push to get them from the mid pos and finish the job off.
                solve(n - 1, b, a, c);
            }
        }


}
