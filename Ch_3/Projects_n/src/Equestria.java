public class Equestria {
    public static void main(String[] args) {
        System.out.println("Exercise 1\n---------------------------\n" + roadTrip(10));
        System.out.println("---------------------------\nExercise 2\n---------------------------");
        System.out.println("Distance from Baltimare to Manehattan = " + distance(29,16,34,8));
        System.out.println("Distance from Los Pegasus to Neighara Falls = " + distance(6,19,22,7));
        System.out.println("Distance from the Badlands to Ponyville = " + distance(25,24,16,14));
    }

    // Problem 1
    public static double roadTrip(double diameter) {
        // C=d(pie)
        return diameter * Math.PI;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
    }
}
