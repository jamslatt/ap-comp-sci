
/////////////////////
// By: James Slattery
// Ch 2 Ex 1
// Found Online at github.com/jamslatt/ap-comp-sci
////////////////////  

public class SlatteryJames_Chap2Ex1 {
    public static void main(String[] args) {
        double initalPos = 1.0;
        double initalVelocity = 1.0;
        double time = 1.0;
        double acceleration =1.0;
        
        double result = initalPos + (initalVelocity * time) + (0.5 * acceleration * (time * time));
        System.out.println(result);
    }
}

