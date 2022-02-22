package ss5_access_modifier_static_method.bai_tap.bai_tap.AcceessModifier;

import java.util.Scanner;

public class TestHinhTron {
    public static void main(String[] args) {
        System.out.println(" enter radius hình tròn  ");
        Scanner scanner = new Scanner(System.in);
        double banKinh = scanner.nextDouble();
        // khỏi tạo đối tượng
        AccessModifier accessModifier = new AccessModifier(banKinh);
        System.out.println(accessModifier.getArea() + " cm2");
// dùng static thì không cần phải khỡi tạo đối towngj cũng được
        System.out.println(AccessModifier.getArea());

    }
}
