// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////
import java.awt.Point;


public class RectangleRunner {
    public static void main(String[] args) {
        Point loc = new Point(2,2);
        Rectangle whoop = new Rectangle(loc,2,2);

        Point check = new Point(2,1);

        if (whoop.contains(check)) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }

}
