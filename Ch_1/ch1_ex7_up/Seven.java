
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
        space();
        space();
        space();
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
    
    public static void stars(int num) {
        for(int i=0; i<num; i++) {
            System.out.print("*");
        }
    }
    
    public static void space() {
        System.out.println();
    }
}
