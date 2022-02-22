package ss5_access_modifier_static_method.bai_tap.bai_tap.AcceessModifier;

class AccessModifier {
    static double radius = 10;
    String color = "red";

    public AccessModifier() {

    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }
// defaut chỉ cho dùng trong 1 package
     double getRadius() {
        return radius;
    }

     void setRadius(double radius) {
        this.radius = radius;
    }

     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }

    static double getArea() {
        double banKinh = Math.pow(radius, 2) * 3.14;
        return banKinh;
    }
}
