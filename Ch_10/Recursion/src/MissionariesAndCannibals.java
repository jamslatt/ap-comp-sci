import java.util.*;

public class MissionariesAndCannibals {
    public static final int NUMBER = 3;

    public static void main(String[] args) {
        Set<String> explored = new HashSet<String>();
        List<String> moves = new ArrayList<String>();
        moves.add("Sequence of Moves:");
        String start = pictureOf(NUMBER, NUMBER, true);
        moves.add(start);
        explored.add(start);
        if (explore(NUMBER, NUMBER, true, moves, explored)) {
            for (String s : moves) {
                System.out.println(s);
            }
        } else {
            System.out.println("No solution");
        }
        System.out.println();
        System.out.println("Total states explored = " + explored.size());
    }

    public static boolean explore(int leftM, int leftC, boolean boatLeft,
                                  List<String> moves, Set<String> explored) {
        if (leftM == 0 && leftC == 0 && !boatLeft) {
            return true;
        } else {
            if (ok(leftM, leftC, boatLeft, moves, explored, 1, 0)
                    || ok(leftM, leftC, boatLeft, moves, explored, 0, 1)
                    || ok(leftM, leftC, boatLeft, moves, explored, 1, 1)
                    || ok(leftM, leftC, boatLeft, moves, explored, 2, 0)
                    || ok(leftM, leftC, boatLeft, moves, explored, 0, 2)) {
                return true;
            } else {
                moves.remove(moves.size() - 1);
                moves.remove(moves.size() - 1);
                return false;
            }
        }
    }

    public static boolean ok(int leftM, int leftC, boolean boatLeft,
                             List<String> moves, Set<String> explored,
                             int numM, int numC) {
        if (boatLeft) {
            leftM -= numM;
            leftC -= numC;
        } else {
            leftM += numM;
            leftC += numC;
        }
        String picture = pictureOf(leftM, leftC, !boatLeft);
        if (!legal(leftM, leftC) || explored.contains(picture)) {
            return false;
        } else {
            explored.add(picture);
            String boat = repeat(NUMBER * 2, " ") + "      \\"
                    + repeat(numM, "M") + repeat(numC, "C")
                    + repeat(2 - numM - numC, "-") + "/";
            moves.add(boat);
            moves.add(picture);
            return explore(leftM, leftC, !boatLeft, moves, explored);
        }
    }

    public static boolean legal(int leftM, int leftC) {
        return (leftM >= 0 && leftM <= NUMBER && leftC >= 0 && leftC <= NUMBER
                && (leftM == 0 || leftM >= leftC)
                && (leftM == NUMBER || (NUMBER - leftM) >= (NUMBER - leftC)));
    }

    public static String pictureOf(int leftMissionaries, int leftCannibals,
                                   boolean boatLeft) {
        String result = repeat(leftMissionaries, "M")
                + repeat(leftCannibals, "C")
                + repeat(2 * NUMBER - (leftMissionaries + leftCannibals), "-");
        if (boatLeft) {
            result += " \\--/           ";
        } else {
            result += "           \\--/ ";
        }
        result += repeat(NUMBER - leftMissionaries, "M")
                + repeat(NUMBER - leftCannibals, "C")
                + repeat(leftMissionaries + leftCannibals, "-");
        return result;
    }

    public static String repeat(int number, String s) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += s;
        }
        return result;
    }
}