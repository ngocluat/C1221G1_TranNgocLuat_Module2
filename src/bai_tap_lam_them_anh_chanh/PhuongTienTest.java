package bai_tap_lam_them_anh_chanh;

import java.util.Scanner;

public class PhuongTienTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" xin chào");
        boolean flag = true;

        XeTai xeTai1 = new XeTai("92-C1 11232", "XE MỸ ", 2001, " TRẦN LUẬT", 10000);
        XeTai xeTai2 = new XeTai("92-C1 11232", "XE MỸ tho ", 1001, " TRẦN LUẬT", 10000);
        XeOto xeOto1 = new XeOto(" 92A1 31151", "Mercedes", 2023, " trần ngọc luật", 6, " xe thể thao");
        XeOto xeOto2 = new XeOto(" 92A1 31151", "Mercedes fake", 2223, " trần ngọc luật", 6, " xe thể thao");
        XeMay xeMay1 = new XeMay("92_N1 19390", "YAMAHA", 2030, " luật trần", 150);
        XeMay xeMay2 = new XeMay("92_N1 19390", "YAMAHA tàu", 2031, " luật trần", 150);

        PhuongTien[] xe = {xeTai1, xeTai2, xeOto1, xeOto2, xeMay1, xeMay2};
        XeTai[] xeTais = new XeTai[10];
        xeTais[0] = xeTai1;
        xeTais[1] = xeTai2;
        XeOto[] xeOtos = new XeOto[10];
        xeOtos[0] = xeOto1;
        xeOtos[1] = xeOto2;
        XeMay[] xeMays = new XeMay[10];
        xeMays[0] = xeMay1;
        xeMays[1] = xeMay2;
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
                            // thêm xe tải

                            int index = -1;
                            for (int i = 0; i < xeTais.length; i++) {
                                if (xeTais[i] == null) {
                                    index = i;
                                    break;
                                }
                            }
//                            Scanner scanner = new Scanner(System.in);

                            System.out.println("nhập biển số ");
                            String bienSo = scanner.nextLine();
                            System.out.println("nhập hãng sản xuất ");
                            String hangSanXuat = scanner.nextLine();
                            System.out.println("sản xuát năm");
                            int namSanXuat = Integer.parseInt(scanner.nextLine());
                            System.out.println("nhập chủ sỡ hữu ");
                            String chuSoHuu = scanner.nextLine();
                            System.out.println(" nhập trọng tải");
                            int trongTai = Integer.parseInt(scanner.nextLine());
                            xeTais[index] = new XeTai(bienSo, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                            break;
                        case 2:
                            // thêm mới xe ô tô
                            break;
                        case 3:
                            // thêm mới xe máy
                            break;
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
                            for (int i = 0; i < xeOtos.length; i++) {
                                if (xeOtos[i] != null) {
                                    System.out.println(xeOtos[i]);
                                } else {
                                    break;
                                }
                            }

                            break;
                        case 3:

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
                    System.out.println(" bạn muốn xóa loại xe nào \n" +
                            "1. xe tải \n" +
                            "2. xe ô tô\n" +
                            "3. xe máy ");
                    int xoaXe = Integer.parseInt(scanner.nextLine());
                    switch (xoaXe) {
                        case 1:
                            // xóa xe tải
                            break;
                        case 2:
                            // xóa xe ô to
                            break;
                        case 3:
                            // xóa xe máy
                            break;
                    }
                    break;
                case 4:
                    flag = false;
                    break;

            }

        } while (flag);


    }
}
