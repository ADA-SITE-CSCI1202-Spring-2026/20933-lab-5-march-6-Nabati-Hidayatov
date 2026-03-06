public class Segment implements Cloneable, Movable {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }

    @Override
    public String toString() {
        return "Segment[" + p1 + " - " + p2 + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Segment)) return false;

        Segment s = (Segment) obj;
        return p1.equals(s.p1) && p2.equals(s.p2);
    }

    @Override
    public Segment clone() {
        try {
            Segment s = (Segment) super.clone();
            s.p1 = p1.clone();
            s.p2 = p2.clone();
            return s;
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }

    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }

    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }

    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }
}