package bai_tap_lam_them_anh_chanh;

import bai_tap_lam_them_anh_chanh.quang_ly_toan_bo_xe.QuanLyXeMay;
import bai_tap_lam_them_anh_chanh.quang_ly_toan_bo_xe.QuanLyXeOTo;
import bai_tap_lam_them_anh_chanh.quang_ly_toan_bo_xe.QuanLyXeTai;
import java.util.ArrayList;
import java.util.Scanner;

public class PhuongTienTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" xin chào");
        boolean flag = true;

            XeTai xeTai1 = new XeTai("92-C1 11232", "XE MỸ ", 2001, " TRẦN LUẬT", 10000);
            XeTai xeTai2 = new XeTai("92-C1 11232", "XE MỸ tho ", 1001, " TRẦN LUẬT", 10000);
            XeOto xeOto1 = new XeOto("92A1 31151", "Mercedes", 2023, " trần ngọc luật", 6, " xe thể thao");
            XeOto xeOto2 = new XeOto("92A1 31151", "Mercedes fake", 2223, " trần ngọc luật", 6, " xe thể thao");
            XeMay xeMay1 = new XeMay("92_N1 19390", "YAMAHA", 2030, " luật trần", 150);
            XeMay xeMay2 = new XeMay("92_N1 19390", "YAMAHA tàu", 2031, " luật trần", 150);

            ArrayList<PhuongTien> phuongTiens = new ArrayList<>();
            phuongTiens.add(xeTai1);
            phuongTiens.add(xeTai2);
            phuongTiens.add(xeOto1);
            phuongTiens.add(xeOto2);
            phuongTiens.add(xeMay1);
            phuongTiens.add(xeOto1);

        do {
            System.out.println(" vui lòng chon chức năng\n" +
                    "1.thêm mới \n" +
                    "2. hiển thị\n" +
                    "3. xóa \n" +
                    "4. thoát ");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    // thêm mới
                    System.out.println(" xin chào bạn muốn thêm mới phương tiện nào \n " +
                            "1. xe tải\n" +
                            "2. xe ô tô\n " +
                            "3. xe máy ");
                    int themMoiXe = Integer.parseInt(scanner.nextLine());
                    switch (themMoiXe) {
                        case 1:
                            QuanLyXeTai.themXeTai();
                            break;
                        case 2:
                            QuanLyXeOTo.themMoiXeOTo();
                            break;
                        case 3:
                            QuanLyXeMay.themMoiXeMay();
                            break;
                        default:
                            System.out.println(" nhập sai");
                    }
                    break;
                case 2:
                    // hiển thị
                    System.out.println(" bạn muốn hiền thị lạo xe nào \n" +
                            "1. xe tải \n" +
                            "2. xe ô tô\n" +
                            "3. xe máy ");
                    int hienThiXe = Integer.parseInt(scanner.nextLine());
                    switch (hienThiXe) {
                        case 1:
                            QuanLyXeTai.hienThiXeTai();
                            break;
                        case 2:
                            QuanLyXeOTo.hienThiXeOTo();
                            break;
                        case 3:
                            QuanLyXeMay.hienThiXeMay();
                            break;
                        default:
                            System.out.println(" nhập sai");
                    }
                    break;
                case 3:
                    // xóa
                    System.out.println(" nhập biển số xe cần xóa ");
                    String iDXoaXe = scanner.nextLine();
                    System.out.println("chọn yes or no");
                    String nhap = scanner.nextLine();
                    if (nhap.equals("yes")) {
                        QuanLyXeTai.xoaXeTai(iDXoaXe);
                        QuanLyXeOTo.xoaXeOTo(iDXoaXe);
                        QuanLyXeMay.xoaXeMay(iDXoaXe);
                    }
                    break;
                case 4:
                    System.out.println(" bạn đã chọn thoát ");
                    flag = false;
                    break;
            }
        }
        while (flag);
    }
}