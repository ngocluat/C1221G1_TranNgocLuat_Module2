package ss6_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc;

public class Square extends Rectangle1 {
    private double width = 1.0;
    private double length = 1.0;

    public Square() {
    }

    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Square(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
