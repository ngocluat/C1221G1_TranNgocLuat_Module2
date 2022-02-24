package ss7_abstract_class_interface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHo;

public class TestColor {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.1, 20, " mà trắng", true);
        Circle circle = new Circle(1, " màu Xanh", true);


        Shape[] mangHinh = {rectangle, circle};

        for (Shape duyetMau : mangHinh) {
            if (duyetMau instanceof IColorable) {
                System.out.println("true");
                duyetMau.howToColor();
            }
            
        }

    }
}
