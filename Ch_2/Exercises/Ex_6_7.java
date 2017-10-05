
/////////////////////
// By: James Slattery
// Ch 2 Ex 6/7
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class Ex_6_7 {
    public static void main(String[] args) {
        six();
        System.out.println();
        seven();
    }
    
    public static void six() {
        for(int i=1; i<=7; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);   
            }
            System.out.println();
        }
    }
    
    public static void seven() {
        for(int i=1; i<=5; i++) {
            for(int j=5; j>=i; j--) {
                System.out.print(" ");
            }
            System.out.print(i + "\n");
        }
    }
}

