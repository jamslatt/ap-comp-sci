
/////////////////////
// By: James Slattery
// Ch 1 Ex 6
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class BoughtMeACat {
    public static void main(String[] args) {
        verseOne();
        verseTwo();
        verseThree();
        verseFour();
        verseFive();
    }

    public static void verseOne() {
        intro("cat");
        out();
    }

    public static void verseTwo() {
        intro("hen");
        noise("Hen","chimmy-chuck");
        out();
    }

    public static void verseThree() {
        intro("duck");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck");
        out();
    }

    public static void verseFour() {
        intro("goose");
        noise("Goose", "hissy");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck");
        out();
    }

    public static void verseFive() {
        intro("sheep");
        noise("Sheep", "baa");
        noise("Goose", "hissy");
        noise("Duck", "quack");
        noise("Hen", "chimmy-chuck");
        out();
    }

    // Component Methods
    public static void intro(String animal) {
        System.out.println("Bought me a " + animal + " and the " + animal + " pleased me,");
        System.out.println("I fed my " + animal + " under younder treee.");
    }

    public static void noise(String animals, String fx) {
        System.out.println(animals + " goes " + fx + ", " + fx + ",");
    }

    public static void out() {
        System.out.println("Cat goes fiddle-i-fee.");
        System.out.println();
    }
    
}

