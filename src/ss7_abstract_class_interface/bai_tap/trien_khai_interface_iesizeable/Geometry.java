package ss7_abstract_class_interface.bai_tap.trien_khai_interface_iesizeable;

public class Geometry {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2.3, 5.8);
        Square square = new Square(4);


        Shape[] mangHinhHoc = {circle, rectangle, square};

        for (Shape arrHinh : mangHinhHoc) {
            //random
            System.out.println("before resize");
            System.out.println(arrHinh.getArea());
            int random = (int) (Math.random() * 100) + 1;
            ((IResizeable) arrHinh).resize(random);
            System.out.println("After resize");

            System.out.println(arrHinh);
            System.out.println(arrHinh.getArea());
        }
    }
}
