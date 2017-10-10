
/////////////////////////////////////////////////////////
// By James Slattery
// Ch 2 Project 2
// View online at https://github.com/jamslatt/ap-comp-sci
//////////////////////////////////////////////////////////

public class ProjectTwo {
    public static void main(String[] args) {
        topHalf();
        bottomHalf();
    }

    public static void hr() {
        System.out.println("+------+");
    }

    public static void topHalf() {
        hr();
        design(" ",6,0,0,0,0);
        for (int i=0;i<2;i++) {
            design("^",2,2,2,0,0);
            design("^",1,1,2,1,1);
            design("^",0,1,4,1,0);
        }
        hr();
    }

    public static void bottomHalf() {
        for(int i=0; i<2; i++) {
            design("v",0,1,4,1,0);
            design("v",1,1,2,1,1);
            design("v",2,2,2,0,0);
        }
        hr();
    }

    public static void design(String design,int firstSpace, int firstArrow, int secondSpace, int secondArrow, int thirdSpace) {
        System.out.print("|");
        for (int i=0; i<firstSpace; i++) {
            System.out.print(" ");
        }

        for (int i=0; i<firstArrow; i++) {
            System.out.print(design);
        }

        for (int i=0; i<secondSpace; i++) {
            System.out.print(" ");
        }

        for (int i=0; i<secondArrow; i++) {
            System.out.print(design);
        }
        for (int i=0; i<thirdSpace; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

}
