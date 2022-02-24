package ss6_ke_thua.thuc_hanh.HeCacDoiTuongHinhHoc;

public class RectangleTest {
    public static void main(String[] args) {
        Square rectangle = new Square();
        System.out.println(rectangle);

        rectangle = new Square(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Square(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
