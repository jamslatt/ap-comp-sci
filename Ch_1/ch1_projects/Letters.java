
//////////////////
// James Slattery
// Ch 1 Project 2
//////////////////

import java.util.Scanner;
public class Letters {
    public static void main(String[] args) {
        // Get general info
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who would you like to write a letter to? (Grandma, Mom, Friend)");
        String to = scanner.next();
        System.out.println("What is your name?");
        String from = scanner.next();
        System.out.println("//////////////////////////////////////");
        System.out.println("//   GENERATING YOUR LETTER         //");
        System.out.println("//////////////////////////////////////");
        // First Paragraph and Space
        paragraphSelector(to);
        System.out.println();
        // Print Common paragraph and space
        commonParagraph();
        System.out.println();
        // End Paragraph
        endPar(to);
        System.out.println();
        System.out.println("Write me back,");
        System.out.println("       " + from);

    }
    public static void paragraphSelector(String rep) {
        if (rep.equals("Grandma") || rep.equals("Mom") ) {
            System.out.println("How are doing? Today I climed McMountian and jumped off of three buildings! I miss you guys.");
            System.out.println("Do you think that the world is flat? I think it may be. Will update you on my investigation.");
            System.out.println("I am broke and have been living off of ramen noodles for the past few monthes. Any support");
            System.out.println("would be greatly appreciated.");
        }
        if (rep.equals("Friend") ) {
            System.out.println("Waaaaaaaaaaaasupppppppp brah! Like how are you like doing! You should see the chicks in CA man.");
            System.out.println("They the real deal! TBH not sure why you are friends with me since I still send letters but its");
            System.out.println("all gooood. Let me know how things are going with those two girlfirends you have. Hopefully they");
            System.out.println("don't find out the other exists. :) rock on my brutttah");
        }
        else {
            System.out.println("Sorry, but I do not know how to write a letter for " + rep + ". Please try \"Grandma\", \"Mom\", or \"Friend\".");   
        }
    }

    public static void commonParagraph() {
        System.out.println("Currently, I am taking classes in math, science, history, and english. They are fun but I need to");
        System.out.println("study more. The senior party life is real. I am ready to graduate and get off this island. What");
        System.out.println("have you been up to?");
    }

    public static void endPar(String k) {
        System.out.println("Well its been good catching up but I need to catch this bus to the next pot shop. Gotta get my herbs to");
        System.out.println("study. Telling you " + k + " you have got to try some of this cannibis. It is some quality stuff!");
        System.out.println("Well catcha on the flip side.");
    }

}
