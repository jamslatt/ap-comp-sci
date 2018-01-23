// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////
import java.awt.Point;

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

}
