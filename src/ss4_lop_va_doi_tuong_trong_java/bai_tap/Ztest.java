package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class Ztest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bán kính hình tròn");
        int banKinh = Integer.parseInt(scanner.nextLine());
        System.out.println(" diện tích hình tròn là");
        DienTichHinhTron dienTich = new DienTichHinhTron(banKinh);
        double hienThiDienTich = dienTich.DienTich();
        System.out.print(hienThiDienTich);

    }
}

class DienTichHinhTron {
    double banKinh;
    DienTichHinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    double DienTich() {
        double dienTichHinhTron = banKinh * banKinh * 3.14;
        return dienTichHinhTron;
    }

}