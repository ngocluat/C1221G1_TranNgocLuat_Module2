package bai_tap_lam_them_anh_chanh;

import java.util.Scanner;

public class PhuongTienTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" xin chào");
        boolean flag = true;

        XeTai xeTai1 = new XeTai("92-C1 11232", "XE MỸ ", 2001, " TRẦN LUẬT", 10000);
        XeTai xeTai2 = new XeTai("92-C1 11232", "XE MỸ tho ", 1001, " TRẦN LUẬT", 10000);
        xeOto xeOto1 = new xeOto(" 92A1 31151", "Mercedes", 2023, " trần ngọc luật", 6, " xe thể thao");
        xeOto xeOto2 = new xeOto(" 92A1 31151", "Mercedes fake", 2223, " trần ngọc luật", 6, " xe thể thao");
        XeMay xeMay1 = new XeMay("92_N1 19390", "YAMAHA", 2030, " luật trần", 150);
        XeMay xeMay2 = new XeMay("92_N1 19390", "YAMAHA tàu", 2031, " luật trần", 150);

        PhuongTien[] xe = {xeTai1, xeTai2, xeOto1, xeOto2, xeMay1, xeMay2};
        do {
            System.out.println(" vui lòn chon chức năng\n" +
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
                            // thêm xe 1
                            XeTai[] xeTais = new XeTai[10];
                            xeTais[0] = xeTai1;
                            xeTais[1] = xeTai2;


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
                            XeTai[] xeTais = new XeTai[10];
                            xeTais[0] = xeTai1;
                            xeTais[1] = xeTai2;
                            for (int i = 0; i < xeTais.length; i++) {
                                if (xeTais[i] != null) {
                                    System.out.println(xeTais[i]);
                                } else {
                                    break;
                                }
                            }
                            break;
                        case 2:
                            // xe oo too
                        case 3:
                            XeMay[] xeMays = new XeMay[10];
                            xeMays[0] = xeMay1;
                            xeMays[1] = xeMay2;
                            for (int i = 0; i < xeMays.length; i++) {
                                if (xeMays[i] != null) {
                                    System.out.println(xeMays[i]);
                                } else {
                                    break;
                                }
                            }
                            break;
                    }

                    break;
                case 3:
                    // xóa
                    break;
                case 4:
                    flag = false;
                    break;

            }

        } while (flag);


    }
}