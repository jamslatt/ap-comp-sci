import java.util.Scanner;


public class TrigFig {
    public static void main(String[] args) {

        // Shows user what side is being refered to by letter.
        triangle("A","B","C");

        // Initalize instance of scanner object.
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate the angles of the triange please provide the length of each side.\n\nSide A:");
        double a = scanner.nextDouble();
        System.out.println("Side B:");
        double b = scanner.nextDouble();
        System.out.println("Side C:");
        double c = scanner.nextDouble();
        System.out.println("Your triangle looks like:");

        // Convert double to string to show triangle
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String C = String.valueOf(c);
        triangle(A,B,C);

        // Are measurements correct?
        System.out.println("\nConfirm Measurements? (Y/N)");
        String confirm = scanner.next();
        if (confirm.equals("Y")) {
            CalculateAndRender(a,b,c);
        }
        // Edit the triangle legs if you want to modify measurements
        else {
            System.out.println("What value do you need to edit?");
            String edit = scanner.next();
            if (edit.equals("A")) {
                System.out.println("Modify A to:");
                a = scanner.nextDouble();
                System.out.println("Modified A to " + a);
                A = String.valueOf(a);
                triangle(A,B,C);
                System.out.println("Calculating angles...");
                CalculateAndRender(a,b,c);

            }
            else if (edit.equals("B")) {
                System.out.println("Modify B to:");
                b = scanner.nextDouble();
                System.out.println("B modified to " + b);
                B = String.valueOf(b);
                triangle(A,B,C);
                System.out.println("Calculating angles...");
                CalculateAndRender(a,b,c);
            }
            else if (edit.equals("C")) {
                System.out.println("Modify C to:");
                c = scanner.nextDouble();
                System.out.println("Modified C to" + c);
                C = String.valueOf(c);
                triangle(A,B,C);
                System.out.println("Calculating angles...");
                CalculateAndRender(a,b,c);
            }
            else {
                System.out.println("Calculating for original triangle values.");
                CalculateAndRender(a,b,c);

            }
        }

    }

    private static void CalculateAndRender (double a , double b, double c) {
        double AngleA = LawOfCosine(a,b,c,'a');
        double AngleB = LawOfCosine(a,b,c,'b');
        double AngleC = LawOfCosine(a,b,c,'c');

        AngleA = Math.round(Math.toDegrees(AngleA) * 100.0) / 100.0;
        AngleB = Math.round(Math.toDegrees(AngleB) * 100.0) / 100.0;
        AngleC = Math.round(Math.toDegrees(AngleC) * 100.0) / 100.0;

        String AngleAStr = String.valueOf(AngleA);
        String AngleBStr = String.valueOf(AngleB);
        String AngleCStr = String.valueOf(AngleC);

        triangleAngle(AngleAStr,AngleBStr,AngleCStr);
    }

    // LoC applied based off a b c legs and which leg you want (char x)
    private static double LawOfCosine(double a, double b, double c, char x) {
        double angle = 0;
        // Angle A
        if (x == 'a') {
            angle = Math.acos(((Math.pow(b,2) + Math.pow(c,2)- Math.pow(a,2))/(2*b*c)));
        }
        // Angle B
        else if (x == 'b') {
            angle = Math.acos(((Math.pow(a,2) - Math.pow(b,2) + Math.pow(c,2))/(2*a*c)));
        }
        // Angle C
        else if (x == 'c') {
            angle = Math.acos(((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2))/(2*a*b)));
        }



        return angle;
    }

    // Generates big triange to show angle measurements (Rounded to hundredths place
    private static void triangleAngle (String a, String b, String c) {
        // Add zeros to rounded numbers not equal to a length of 5 (to keep triangle in shape for all numbers)
        if ( c.length() < 5) {
            for (int i=5; i>c.length(); i--)
                c = c + "0";
        }
        else if ( a.length() < 5) {
            for (int i=5; i>a.length(); i--)
                a = a + "0";
        }
        else if (b.length() < 5) {
            for (int i=5; i>b.length(); i--)
                b = b + "0";
        }

        // Render triangle
        System.out.println("        /\\");
        System.out.println("       /  \\");
        System.out.println("      /    \\");
        System.out.println("     /      \\  ");
        System.out.println("    /        \\");
        System.out.println("   /  " + c + "   \\");
        System.out.println("  /            \\");
        System.out.println(" /              \\");
        System.out.println("/ " + b +  "    " + a + " \\");
        System.out.println("------------------");
    }


    // Generates a small triangle to represent the sides
    private static void triangle(String a, String b, String c) {
        int dice = a.length();
        dice(dice);
        System.out.println("     /\\");
        System.out.println(" " + a + "  /  \\  " + b);
        dice(dice);
        System.out.println("   /    \\");
        dice(dice);
        System.out.println("   ------");
        System.out.println("      " + c);
    }

    // Accounts for the length of the measured number when rendering the triangle
    private static void dice(int dice) {
        for (int i = 1; i <= dice - 1; i++)
            System.out.print(" ");
    }
}
