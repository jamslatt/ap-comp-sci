
/////////////////////////////////////////////////////////
// By James Slattery
// Ch 2 Project 3
// View online at https://github.com/jamslatt/ap-comp-sci
//////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////
//
// Pusedo Code
//
//////////////////////////////////////////////////////////
/*
 * Plan is to write four methods (main, up arrow, down arrow, and the line that divides the two sectors)
 * each part is composed of nested four loops that print each line one by one and subtract or add components
 * each time. Once each component is built use the main method to create the desired design and have a global
 * variable and basic for loop to define how many times that design is printed.
 */
//////////////////////////////////////////////////////////

public class ProjectThree {
    public static final int AMT = 2;
    
    public static void main(String[] args) {
       for(int i=1; i<=AMT; i++) {
        // Prints the whole design into the console.
        hr();
        up();
        down();
        hr();
        down();
        up();
        hr();
        //// Makes it easier to tell when next repitition starts based off of AMT
        System.out.println();
        System.out.println();
       }
    }

    public static void hr() {
        // Just a static method for the bar seperating designs
        System.out.println("+---------+");
    }
    
    // Prints the up facing arrow thing
    public static void up() {
        int spaces = 4;
        int slashes = 0;
        int secondSlash = 0;
        int lastSpace = 4;
        
        // Needs to print four lines, one for each part of the up arrow
        for (int i=1; i<=4; i++) {
            // Inital bar
            System.out.print("|");
            
            // Prints 4 then 3 then 2 then 1 spaces
            for (int spaceDef=1; spaceDef<=spaces; spaceDef++) {
                System.out.print(" ");
            }
            spaces -= 1;
            
            
            // Prints 0 then 1 then 2 then threee slashes
            for(int slashDef = 0; slashDef<slashes; slashDef++) {
                System.out.print("/");
            }
            slashes += 1;
            
            // Middle Star print
            System.out.print("*");
            
            // Prints 0 then 1 then 2 then three slashes
            for(int sSlashDef=0; sSlashDef<secondSlash; sSlashDef++) {
                System.out.print("\\");
            }
            secondSlash += 1;

            // Prints four then three then two then one spaces
            for(int sSpace=1; sSpace<=lastSpace; sSpace++) {
                System.out.print(" ");
            }
            lastSpace -= 1;
            
            // Final bar and returns line
            System.out.println("|");
            
            // Loop prints four times

        }

    }
    
    // Down arrow
    public static void down() {
        // Defined variables
        int negSpace = 1;
        int negSlash = 0;
        int negBSlash = 0;
        int negSSpace = 1;
        
        // Runs loop four times one for each line
        for (int k=1; k<=4; k++) {
            
            // Prints inital bar
            System.out.print("|");
            
            // Prints one, then two then three then four spaces
            for (int space=1; space<=negSpace; space++) {
                System.out.print(" ");
            }
            negSpace +=1;

            // Prints three then two then one then zero slashes
            for (int slash=3; slash>negSlash; slash--) {
                System.out.print("\\");
            }
            negSlash += 1;
            
            // Middle star
            System.out.print("*");

            // Prints three then two then one then zero slashes
            for (int Bslash = 3; Bslash>negBSlash; Bslash--) {
                System.out.print("/");
            }
            negBSlash += 1;

            // Prints one then two then three then four spaces
            for (int sspace=1; sspace<= negSSpace; sspace++) {
                System.out.print(" ");
            }
            negSSpace += 1;

            // End bar and return line
            System.out.println("|");
        }
    }
}
