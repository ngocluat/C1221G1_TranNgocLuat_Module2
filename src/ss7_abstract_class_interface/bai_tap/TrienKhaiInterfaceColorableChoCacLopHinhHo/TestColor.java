package ss7_abstract_class_interface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHo;

public class TestColor {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.1, 20, "màu trắng", true);
        Circle circle = new Circle(1, " màu Xanh", true);

        Shape[] mangHinh = {rectangle, circle};
//                  ép lên

//        for (Shape duyetMau : mangHinh) {
//            if (duyetMau instanceof Rectangle) {
//                System.out.println(((Rectangle) duyetMau).getArea());
//                duyetMau.howToColor();
//            } else if (duyetMau instanceof Circle) {
//                System.out.println(((Circle) duyetMau).getArea());
//                            ép xuống Circle     Shape

//            }

        for (Shape elemennt : mangHinh) {
            System.out.println(elemennt.getArea());
            if (elemennt instanceof Rectangle) {
                elemennt.howToColor();
            }
        }
    }
}
