import java.awt.*;
import java.util.Scanner;

public class CollegeAdmissions {
    public static void main(String[] args) {
        int SAT = 0;
        int SAT2 = 0;
        int ACT = 0;
        int ACT2 = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter Applicant #1 Data...\nGPA:");
        double GPA = console.nextDouble();
        System.out.println("Did this applicant take the SAT or ACT?");
        String test = console.next();
        if (test.equals("SAT")) {
            System.out.println("What did they score on the SAT?");
            SAT = console.nextInt();
            System.out.println("Student #1: GPA " + GPA + " SAT: " + SAT + ".");
        }
        else {
            System.out.println("What did they score on the ACT?");
            ACT = console.nextInt();
            System.out.println("Student #1: GPA " + GPA + " ACT: " + ACT + ".");
        }
        // Student 2
        System.out.println("Enter Applicant #2 Data...\nGPA:");
        double GPA2 = console.nextDouble();
        System.out.println("Did this applicant take the SAT or ACT?");
        String test2 = console.nextLine();
        if (test2.equals("SAT")) {
            System.out.println("What did they score on the SAT?");
            SAT2 = console.nextInt();
            System.out.println("Student #1: GPA " + GPA2 + " SAT: " + SAT2 + ".");
        }
        else {
            System.out.println("What did they score on the ACT?");
            ACT2 = console.nextInt();
            System.out.println("Student #2: GPA " + GPA2 + " ACT: " + ACT2 + ".");
        }

        // Return student values?
        if (GPA > GPA2) {
            if (ACT > ACT2 && SAT > SAT2) {
                System.out.print("Student #1 has a higher GPA and Standard Test score. Admit them.");
            }
            System.out.print("Student #1 has a higher GPA but a lower Standard Test score. Reivew their essay to learn more about each canidate.");

        }

        if (GPA2 > GPA) {
            if (ACT2 > ACT && SAT2 > SAT) {
                System.out.print("Student #2 has a higher GPA and standard test score. Admit them.");

            }
            System.out.print("Student #2 has a higher GPA but a lower Standard test score. Review their essay to learn more about them.");
        }

    }


}
