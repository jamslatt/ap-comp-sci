
/////////////////////
// By: James Slattery
// Ch 2 Ex 4/5
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class SlatteryJames_Chap2Ex_4_5 {
    public static void main(String[] args) {
        four();
        System.out.println();
        five();
    }

    ////////////////
    // Ex 4
    ///////////////
    public static void four() {
        // Loops that Runs Code 4 Times
        for (int i=0; i<4; i++) {
            // Loop that prints stars
            for(int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /////////////////
    // Ex 5
    ////////////////
    public static void five() {
        for (int o=1; o<=5; o++) {
            for(int j=1; j<=o; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

