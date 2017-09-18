
/////////////////////
// By: James Slattery
// Ch 1 Project 3
/////////////////////
public class Chap1Proj3JamesSlattery {
    public static void main(String[] args) {
        
    }

    public static void lyrics() {
        intro("fly");
        idk();
        die();
        System.out.println();
        
        intro("spider");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        mid("spider","fly");
        idk();
        die();
        System.out.println();
        
        intro("bird");
        System.out.println("How absurd to swallow a bird.");
        mid("bird","spider");
        mid("spider","fly");
        idk();
        die();
        System.out.println();
        
        intro("cat");
        System.out.println("Imagine that to swallow a cat.");
        mid("cat","bird");
        mid("bird","spider");
        mid("spider","fly");
        idk();
        die();
        System.out.println();
        
        intro("dog");
        System.out.println("What a hog to swallow a dog.");
        mid("dog","cat");
        mid("cat","bird");
        mid("bird","spider");
        mid("spider","fly");
        idk();
        die();
        System.out.println();
        
        intro("horse");
        System.out.println("She died of course.");
    }
    
    public static void mid(String first, String second) {
        System.out.println("She swallowed the " + first + " to catch the " + second + ",");
    }
    
    public static void intro(String txt) {
        System.out.println("There was an old lady who swallowed a " + txt + ",");
    }
    
    public static void die() {
        System.out.println("Perhaps she'll die.");
    }
    
    public static void idk() {
        System.out.println("I don't know why she swallowed that fly,");
    }
}
