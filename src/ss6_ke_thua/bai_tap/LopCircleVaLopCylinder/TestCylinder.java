package ss6_ke_thua.bai_tap.LopCircleVaLopCylinder;

import java.util.Scanner;

public class TestCylinder {
    private static Object Cylinder;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều cao  ");
        int chieuCao = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập bán kính  ");
        int banKinh = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập màu sắt  ");
        String mauSat = scanner.nextLine();
        Cylinder cylinder = new Cylinder(chieuCao,banKinh,mauSat);
        Cylinder cylinder1 = new Cylinder(chieuCao,banKinh,mauSat);
        System.out.println(cylinder.theTich());
        System.out.println(cylinder);


        Circlee[] arrCircle= {cylinder,cylinder1};
        for (Circlee a : arrCircle) {
        }

    }
}
