///////////////////////////////////////////////////
// By James Slattery
// Chapter 3 Programming Project
// Avaiable online at https://github.com/jamslatt
///////////////////////////////////////////////////

public class Equestria {
    public static void main(String[] args) {
        // Displays the answers to the distances it asks for in the questions.
        System.out.println("Exercise 1\n---------------------------\n" + roadTrip(10));
        System.out.println("---------------------------\nExercise 2\n---------------------------");
        System.out.println("Distance from Baltimare to Manehattan = " + distance(29,16,34,8));
        System.out.println("Distance from Los Pegasus to Neighara Falls = " + distance(6,19,22,7));
        System.out.println("Distance from the Badlands to Ponyville = " + distance(25,24,16,14));
        // Problem 3
        System.out.println("---------------------------\nExercise 3\n---------------------------\n");
        System.out.println("The distance from Balimare then Los Pegasus then Badlands is " + triDistance(29,16,6,19,25,24));
        // Problem 4
        System.out.println("---------------------------\nExercise 4\n---------------------------\n");
        System.out.println("The distance form Balimare then Los Pegasus then Badlands then Ponyville then back to Baltimare is " + rectDist(29,16,6,19,25,24,16,14));

    }

    // Problem 1
    public static double roadTrip(double diameter) {
        // C=d(pie)
        return diameter * Math.PI;
    }

    // Problem 2
    public static double distance(int x1, int y1, int x2, int y2) {
        // Plugs x1,y1,x2,y2 into the distance formula and returns the value
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
    }

    // Problem 3
    public static double triDistance(int loc1x, int loc1y, int loc2x, int loc2y, int loc3x, int loc3y) {
        // Calculates the distance between the start point and the end point by taking distance
        // between start and second stop and adding it to second to last stop.
        return distance(loc1x,loc1y,loc2x,loc2y) + distance(loc2x,loc2y,loc3x,loc3y);
    }

    // Problem 4
    public static double rectDist(int loc1x, int loc1y, int loc2x, int loc2y, int loc3x,int loc3y, int loc4x, int loc4y) {
        // Returns the value of the total distance from start to start of the rectangular path.
        return triDistance(loc1x,loc1y,loc2x,loc2y,loc3x,loc3y) + distance(loc3x,loc3y, loc4x,loc4y) + distance(loc4x,loc4y,loc1x,loc1y);
    }


}
