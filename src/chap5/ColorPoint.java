package chap5;

class Point {
    int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void set(int x, int y) {
        this.x = x; this.y = y;
    }
    void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

public class ColorPoint extends Point {
    String color;

    public ColorPoint() {
    }

    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }

    void setColor(String color) {
        this.color = color;
    }
    void showColorPoint() {
        System.out.print(color);
        showPoint();
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
        ColorPoint cpt = new ColorPoint(5, 6, "blue");
        cpt.showColorPoint();
    }
}
