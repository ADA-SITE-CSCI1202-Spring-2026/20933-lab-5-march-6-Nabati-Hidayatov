public class Rectangle implements Cloneable {

    protected double width;
    protected double height;

    public Rectangle() {
        this(0,0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return "Rectangle(" + width + "," + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Rectangle)) return false;

        Rectangle r = (Rectangle) obj;
        return width == r.width && height == r.height;
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}