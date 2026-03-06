public class Circle implements Movable, Cloneable {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return center; }

    public double getRadius() { return radius; }

    @Override
    public String toString() {
        return "Circle(center=" + center + ", radius=" + radius + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Circle)) return false;

        Circle c = (Circle) obj;
        return center.equals(c.center) && radius == c.radius;
    }

    @Override
    public Circle clone() {
        try {
            Circle c = (Circle) super.clone();
            c.center = center.clone();
            return c;
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }
}