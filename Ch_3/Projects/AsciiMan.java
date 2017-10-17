
/////////////////////////////////////////////////////////
// By James Slattery
// ASCII Man
// View online at https://github.com/jamslatt/ap-comp-sci
//////////////////////////////////////////////////////////


public class AsciiMan {
    public static void main(String[] args) {
        // First Two Rows
        System.out.println("!");
        System.out.print("H");
        for (int i=0; i<35;i++) {
            System.out.print("_");
        }
        System.out.println();
        // Flag time boiii
        for (int j=1; j<=4; j++) {
            if(j==1 || j==3 ){
                System.out.print("H| * * * * * |");
            }
            if(j==2 || j==4) {
                System.out.print("H|* * * * * *|");
            }
            for (int c=1;c<22; c++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
        // Bottom of Flag
        for(int o = 0; o<4; o++) {
            System.out.print("H|");
            for(int l=0; l<33; l++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
        // Last line of Flag
        System.out.print("H");
        for(int y=1; y<=35; y++) {
            System.out.print("-");
        }
        System.out.println();
        // Base of Flag
        for (int u=0; u<10; u++) {
            System.out.println("H");
        }
    }
    
    public static void space(int amt) {
        for(int i=0;i<amt;i++) {
            System.out.print(" ");
        }
    }
}
