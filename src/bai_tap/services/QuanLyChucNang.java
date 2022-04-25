package bai_tap.services;

import bai_tap.util.RegexInput;

import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);

    public static String ngayNhapVien() {
        String ngayNhapVien1 = null;
        do {
            System.out.print("Ngày nhập viện");
            ngayNhapVien1 = scanner.nextLine();
            if (RegexInput.regexNgaySinh(ngayNhapVien1)) {
                break;
            } else {
                System.out.println(" hình như bạn nhaappj sai định dạng ngày sinh");
            }
        } while (true);
        return ngayNhapVien1;
    }

    public static String ten() {
        String tenBenNhan = null;
        do {
            System.out.print("Tên bệnh nhân");
            tenBenNhan = scanner.nextLine();
            if (RegexInput.regexName(tenBenNhan)) {
                break;
            } else {
                System.out.println(" nhập sai tên không đúng định dạng ");
            }
        } while (true);
        return tenBenNhan;
    }

    public static String maBenhNhan() {
        String maBenNhan1;
        do {
            System.out.print("Mã bệnh nhân Mã bệnh nhân phải đúng định dạng BN-XXX, với XXX là các kí tự số.");
            maBenNhan1 = scanner.nextLine();
            if (RegexInput.regexMaBenNhan(maBenNhan1)) {
                break;
            } else {
                System.out.println("nhập sai mã bện nhân ");
            }
        } while (true);
        return maBenNhan1;
    }

    public static String maBenhAn() {
        String maBenhAn1;
        do {
            System.out.print("Mã bệnh án Mã bệnh án phải đúng định dạng BA-XXX, với XXX là các kí tự số");
            maBenhAn1 = scanner.nextLine();
            if (RegexInput.regexMaBenAn(maBenhAn1)) {
                break;
            } else {
                System.out.println(" nhập sai mã bệnh án ");
            }
        } while (true);
        return maBenhAn1;

    }
}
