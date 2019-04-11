public class Rectangle {
    int width, height;

    public int computeAreaRectangle(Rectangle a) {
        return a.width * a.height;
    }

    public boolean isSquare(Rectangle a) {
        return a.height == a.width;
    }

    public static boolean isEquealRectangles(Rectangle a, Rectangle b) {
        return (a.height == b.height) && (a.width == b.width);
    }

    public static void main(String args[]) {
    Rectangle first = new Rectangle();
    Rectangle second = new Rectangle();
    first.width=3;
    first.height=3;
    second.width=3;
    second.height=5;
    System.out.println("computeAreaRectangle: "+first.computeAreaRectangle(first));
    System.out.println("isSquare: "+first.isSquare(first));
    System.out.println("isEquealRectangles: "+isEquealRectangles(first,second));
    }
}
