package ss6_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc;

public class Rectangle1 {
    private String color = "green";
    private boolean filled = true;

    public Rectangle1() {
    }

    public Rectangle1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Rectangle1 with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


}

