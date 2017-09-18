
/////////////////////
// By: James Slattery
// Ch 1 Ex 5
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class TheHouseThatJackBuilt {
    public static void main(String[] args) {
        System.out.println("This is the house that Jack built.");
        System.out.println();
        verseOne();
        verseTwo();
        verseThree();
        verseFour();
        verseFive();
        verseSix();
    }
    
    // Verses
    public static void verseOne() {
        System.out.println("This is the malt");
        end();
    }
    
    public static void verseTwo() {
        is("rat");
        ate("malt");
        end();
    }
    
    public static void verseThree() {
        is("cat");
        kill("rat");
        ate("malt");
        end();
    }
    
    public static void verseFour() {
        is("dog");
        worry("cat");
        kill("rat");
        ate("malt");
        end();
    }
    
    public static void verseFive() {
        is("cow with the crumpled horn");
        tossed("dog");
        worry("cat");
        kill("rat");
        ate("malt");
        end();
    }
    
    public static void verseSix() {
        is("maiden all forlorn");
        System.out.println("That milked the cow with the crumpled horn,");
        tossed("dog");
        worry("cat");
        kill("rat");
        ate("malt");
        end();
    }

    // Other Phrases
    public static void is(String it){
        System.out.println("This is the " + it +",");
    }

    public static void ate(String atee) {
        System.out.println("That ate the " + atee + ",");
    }

    public static void end() {
        System.out.println("That lay in the house that Jack built.");
        System.out.println();
    }

    public static void kill(String dead) {
        System.out.println("That killed the " + dead + ",");
    }

    public static void worry(String worried) {
        System.out.println("That worreid the " + worried + ",");
    }

    public static void tossed(String tos) {
        System.out.println("That tossed the " + tos + ",");
    }
}

