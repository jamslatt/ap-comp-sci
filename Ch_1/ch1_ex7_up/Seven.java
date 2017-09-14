
/**
James Slattery
Number 7-11
 */
public class Seven
{
    public static void main(String[] args) {

    }

    //Number 7
    public static void victory() {
        for(int i=0; i<5;i++) {
            System.out.println("//////////////////////");
            System.out.println("|| Victory is mine! ||");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        }
    }

    //Number 8
    public static void ball() {
        System.out.println("  ______ ");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("-\"-'-\"-\"-\"");
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    //Number 9
    public static void ballModified() {
        System.out.println("  ______ ");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
        System.out.println("-\"-'-\"-\"-\"");
        System.out.println();
        System.out.println("  ______ ");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("-\"-'-\"-\"-\"");
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
        System.out.println("-\"-'-\"-\"-\"");
        System.out.println("\\        /");
        System.out.println(" \\______/");
        System.out.println();
        ball();
    }

    // Number 10
    public static void spaceShips() {
        System.out.println("   /\\     /\\");
        System.out.println("  /  \\   /  \\");
        System.out.println(" /    \\ /    \\");
        System.out.println(" +----+ +----+ ");
        System.out.println(" |USA | |USA | ");
        System.out.println(" |    | |    | ");
        System.out.println(" +----+ +----+ ");
        System.out.println(" |    | |    | ");
        System.out.println(" |    | |    | ");
        System.out.println(" +----+ +----+ ");
        System.out.println("   /\\    /\\  ");
        System.out.println("  /  \\  /  \\ ");
        System.out.println(" /    \\/    \\");
    }

    // Number 11
    public static void primaryEleven() {
        firstChunk();
        space();
        space();
        stars(5);
        space();
        firstChunk();
        space();
        stars(5);
        space();
        stars(5);
        space();
        space();
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        stars(5);
        space();
        stars(5);
        space();
        System.out.print(" ");
        stars(1);
        System.out.print(" ");
        stars(1);
        space();
        System.out.print("  ");
        stars(1);
        space();
        System.out.print(" ");
        stars(1);
        System.out.print(" ");
        stars(1);

    }
    public static void firstChunk() {
        stars(5);
        space();
        stars(5);
        space();
        System.out.print(" ");
        stars(1);
        System.out.print(" ");
        stars(1);
        space();
        System.out.print("  ");
        stars(1);
        space();
        System.out.print(" ");
        stars(1);
        System.out.print(" ");
        stars(1);
    }

    public static void stars(int num) {
        for(int i=0; i<num; i++) {
            System.out.print("*");
        }
    }

    public static void space() {
        System.out.println();
    }

    ////////////////////////
    // Question 12
    // By James Slattery
    ///////////////////////
    public static void twelveMain() {
        trap(2);
        line();
        System.out.println();
        System.out.println("  _______  " );
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("|   STOP  |");
        System.out.println("\\         /");
        System.out.println(" \\_______/ ");
        line();

    }
    
    // Creates Line Once and returns line.
    public static void line() {
        System.out.println("  +-------+  ");
    }
    
    
    // Requires an int to be passed in then runs a loop that many times. i++ means it goes up one each time
    // to count to the passed in int.
    public static void trap(int rep) {
        for(int i=0; i<rep; i++) {
            System.out.println("  _______  " );
            System.out.println(" /       \\");
            System.out.println("/         \\");
            System.out.println("\\         /");
            System.out.println(" \\_______/ ");
            System.out.println();
        }
    }
}
