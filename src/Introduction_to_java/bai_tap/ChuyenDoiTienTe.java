package Introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input VND");
        double vietNamDong = scanner.nextDouble();
        System.out.println(vietNamDong + " VND convert to money USD " + vietNamDong / 23000);
        System.out.println("input USD");
        
        System.out.println();
    }
}
