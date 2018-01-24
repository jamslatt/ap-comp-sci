// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////
import java.awt.Point;
import java.util.Arrays;


public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // Inital Constructor
    public Rectangle(int xVal, int yVal, int widthVal, int heightVal) {
        if (widthVal < 0 || heightVal < 0) {
            throw new IllegalArgumentException();
        }
        this.x = xVal;
        this.y = yVal;
        this.width = widthVal;
        this.height = heightVal;
    }

    // Point Constructor
    public Rectangle(Point p, int widthVal, int heightVal) {
        if (widthVal < 0 || heightVal < 0) {
            throw new IllegalArgumentException();
        }
        this.x = p.x;
        this.y = p.y;
        this.height = heightVal;
        this.width = widthVal;
    }

    // Get Height
    public int getHeight() {
        return height;
    }

    // Get Width
    public int getWidth() {
        return width;
    }

    // Get x-coord
    public int getX() {
        return x;
    }

    // Get y-cord
    public int getY() {
        return y;
    }

    // Override toString()
    public String toString() {
        return "Rectangle [x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "].";
    }

    // Meth
    public boolean contains(int x2, int y2) {
        int range = y - height;
        int domain = x + width;
        if ((y2 <= y) && (y2 >= range)) {
            if ((x2 >= x) && (x2 <= domain)) {
                return true;
            }
        }

        return false;
    }

    public boolean contains(Point p2) {
        int range = y - height;
        int domain = x + width;
        if ((p2.y <= y) && (p2.y >= range)) {
            if ((p2.x >= x) && (p2.x <= domain)) {
                return true;
            }
        }

        return false;
    }

    // Box the box
    public Rectangle union(Rectangle rect) {
        // 1st Rect
        int range = y - height;
        int domain = x + width;
        // 2nd Rect
        int range2 = rect.y - rect.height;
        int domain2 = rect.x + rect.width;
        // x min max
        int[] xVals = new int[4];
        xVals[0] = x;
        xVals[1] = domain;
        xVals[2] = rect.x;
        xVals[3] = domain2;
        Arrays.sort(xVals);
        int xMin = xVals[0];
        int xMax = xVals[3];
        // y min max
        int[] yVals = new int[4];
        yVals[0] = y;
        yVals[1] = range;
        yVals[2] = rect.y;
        yVals[3] = range2;
        Arrays.sort(yVals);
        int yMin = yVals[0];
        int yMax = yVals[3];
        // Rect calculations
        Point bigRect = new Point(xMin, yMax);

        return new Rectangle(bigRect, (xMax-xMin), (yMax-yMin));
    }

    //public Rectangle intersect(Rectangle rect) {

    //}

}
