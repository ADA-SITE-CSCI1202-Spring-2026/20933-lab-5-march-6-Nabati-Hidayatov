public class Point implements Cloneable, Movable {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Point)) return false;

        Point p = (Point) obj;
        return x == p.x && y == p.y;
    }

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void moveUp() { y++; }
    public void moveDown() { y--; }
    public void moveLeft() { x--; }
    public void moveRight() { x++; }
}