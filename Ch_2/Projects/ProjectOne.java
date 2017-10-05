
/////////////////////
// By: James Slattery
// Ch 2 Project 1
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class ProjectOne {
    public static void main(String[] args) {

    }

    public static void box() {
        // Declare Vars
        int a = 6;
        int aa = 6;
        int uu = 12;
        int kk = 0;
        int space = 1;
        int sspace = 1;
        
        // Runs 6 times
        for(int i=0; i<6; i++) {
            /*
             * Prints out a stars then subtracts one from
             * a value
             */
            for (int b = 1; b<=a; b++) {
                System.out.print("*"); 
            }
            a -= 1;
            
            /*
             * Prints space spaces then adds one to
             * space var
             */
            for (int q=1; q<=space; q++) {
                System.out.print(" ");
            }
            space += 1;
            
            /*
             * Prints uu forward slashes then subtracts
             * one from uu.
             */
            for (int u=1; u<=uu; u++) {
                System.out.print("/");

            }
            uu -= 1;
            
            
            /*
             * Prints kk forward slashes then
             * subtracts one from kk
             */
            for (int k=1; k<=kk; k++) {
                System.out.print("\\");
            }
            kk += 1;
            
            /*
             * Prints sspace spaces then
             * adds one to sspace
             */
            for (int qq=1; qq<=sspace; qq++) {
                System.out.print(" ");
            }
            sspace += 1;
            
            /*
             * Print aa stars then subtract one from
             * aa.
             */
            for (int bb = 1; bb<=aa; bb++) {
                System.out.print("*"); 
            }
            aa -= 1;

            
            // Space to create new line with new vlaues.
            System.out.println();
        }
    }
}

