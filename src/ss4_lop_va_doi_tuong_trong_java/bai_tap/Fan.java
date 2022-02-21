package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    public static final int SLOW = 1;
    public static final int MIDIUM = 2;
    public static final int FAST = 3;
    int speed;
    boolean on = false;
    double radius;
    String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //phương thức trả về speed, color, và radius với chuỗi “fan is on”
    public String toString() {
        if (this.isOn()) {
            return "Fan{" +
                    "slow=" + this.getSpeed() +
                    ", color='" + this.getColor() + '\'' +
                    ", radius=" + this.getRadius() +
                    " fan is on" +
                    '}';
        } else {
            return "color='" + this.getColor() + '\'' +
                    " quạt đang tắt " +
                    ", radius=" + this.getRadius();
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setOn(true);
        fan1.setColor("red");
        fan1.setRadius(10);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MIDIUM);
        fan2.setOn(false);
        fan2.setRadius(5);
        System.out.println(fan2.toString());
    }
}
