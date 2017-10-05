
/////////////////////
// By: James Slattery
// Ch 2 Ex 4/5
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class SlatteryJames_Chap2Ex_4_5 {
    public static void main(String[] args) {
        
    }
    
    public static void four() {
        for (int i=0; i<4; i++) {
         for(int j=0; j<5; j++) {
             System.out.print("*");
         }
         System.out.println();
        }
    }
    
   
    public static void five() {
        for (int o=1; o<=5; o++) {
         stars(o);
         System.out.println();
        }
    }
    
    public static void stars(int amt) {
        for (int i=0; i<amt; i++) {
            System.out.print("*");
        }
    }
}

