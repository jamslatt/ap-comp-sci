
/////////////////////////////////////////////////////////
// By James Slattery
// Ch 2 Project 2
// View online at https://github.com/jamslatt/ap-comp-sci
// Warning: This code needs to be cleaned up... :D
//////////////////////////////////////////////////////////

public class ProjectUnDefined {
    public static final int AMT = 2;
    
    
    public static void main(String[] args) {
        for (int i = 0; i<AMT; i++) {
            hourGlass();
            System.out.println();
            System.out.println();
        }
    }
    
    public static void hourGlass() {
        int a = 4;
        int initspace = 6;

        System.out.println("        :\"\"\"\"\"\"\"\"\"':");
        for( int i = 0; i<5; i++) {
            System.out.print(" ");
            for (int spaces = 0; spaces<=initspace; spaces++) {
                System.out.print(" ");
            }
            initspace += 1;
            
            System.out.print("\\");
            for (int b = 1; b<=a; b++) {
                System.out.print(": "); 
            }
            a -= 1;
            System.out.print(":/");
            
            System.out.println();
            
        }
        
        int kk = 0;
        for( int j = 0; j<5; j++) {
            for (int spacess = 0; spacess<=initspace; spacess++) {
                System.out.print(" ");
            }
            initspace -= 1;
            
            System.out.print("/");
            for (int k=1; k<=kk; k++) {
                System.out.print(": "); 
            }
            kk += 1;
            System.out.print(":\\");
            
            System.out.println();
            
        }
        System.out.println("        :\"\"\"\"\"\"\"\"\"':");
    }
}
