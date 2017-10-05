
/////////////////////
// By: James Slattery
// Count to Thousand
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class countToThousand {public static void main(String[] args) {
        int l=1;
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++){
                for (int k=1; k<=10; k++) {
                    System.out.println(l);
                    l+=1;
                }
            }
        }
    }
}
