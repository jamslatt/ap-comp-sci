// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int xVal, int yVal, int widthVal, int heightVal) {
        if (widthVal < 0 || heightVal < 0) {
            throw new IllegalArgumentException();
        }
        this.x = xVal;
        this.y = yVal;
        this.width = widthVal;
        this.height = heightVal;
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

}
