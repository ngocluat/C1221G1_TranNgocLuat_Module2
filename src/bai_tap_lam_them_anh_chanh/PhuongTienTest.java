package bai_tap_lam_them_anh_chanh;

import java.util.ArrayList;
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

        ArrayList<PhuongTien> phuongTiens = new ArrayList<>();
        phuongTiens.add(xeTai1);
        phuongTiens.add(xeTai2);
        phuongTiens.add(xeOto1);
        phuongTiens.add(xeOto2);
        phuongTiens.add(xeMay1);
        phuongTiens.add(xeOto1);

        ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();
        xeTaiArrayList.add(xeTai1);
        xeTaiArrayList.add(xeTai2);

        ArrayList<XeOto> otoArrayList = new ArrayList<>();
        otoArrayList.add(xeOto1);
        otoArrayList.add(xeOto2);

        ArrayList<XeMay> xeMayArrayList = new ArrayList<>();
        xeMayArrayList.add(xeMay1);
        xeMayArrayList.add(xeMay2);

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
                            // thêm xe tải

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
                            xeTaiArrayList.add(new XeTai(bienSo, hangSanXuat, namSanXuat, chuSoHuu, trongTai));

                            break;
                        case 2:
                            // thêm mới xe ô tô
                            System.out.println("nhập biển số ");
                            String bienSoOTo = scanner.nextLine();
                            System.out.println("nhập hãng sản xuất ");
                            String hangSanXuatOTo = scanner.nextLine();
                            System.out.println("sản xuát năm");
                            int namSanXuat0To = Integer.parseInt(scanner.nextLine());
                            System.out.println("nhập chủ sỡ hữu ");
                            String chuSoHuuOto = scanner.nextLine();
                            System.out.println(" nhập số chổ ngồi");
                            int soChoNgoiXeOto = Integer.parseInt(scanner.nextLine());
                            System.out.println(" nhập  kiểu xe ");
                            String kieuXeOto = scanner.nextLine();
                            otoArrayList.add(new XeOto(bienSoOTo, hangSanXuatOTo, namSanXuat0To, chuSoHuuOto, soChoNgoiXeOto, kieuXeOto));

                            break;
                        case 3:
                            // thêm mới xe máy

                            System.out.println("nhập biển số ");
                            String bienSoXeMay = scanner.nextLine();
                            System.out.println("nhập hãng sản xuất ");
                            String hangSanXuatXeMay = scanner.nextLine();
                            System.out.println("sản xuát năm");
                            int namSanXuatXeMay = Integer.parseInt(scanner.nextLine());
                            System.out.println("nhập chủ sỡ hữu ");
                            String chuSoHuuXeMay = scanner.nextLine();
                            System.out.println(" nhập số coong xuất ");
                            int congXuatXeMay = Integer.parseInt(scanner.nextLine());

                            xeMayArrayList.add(new XeMay(bienSoXeMay, hangSanXuatXeMay, namSanXuatXeMay, chuSoHuuXeMay, congXuatXeMay));

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
                            //hienThiXeTai(xeTais);//
                            for (int i = 0; i < xeTaiArrayList.size(); i++) {
                                System.out.println(xeTaiArrayList.get(i));
                            }
                            break;
                        case 2:
                            // xe ootoo
                            for (int i = 0; i < otoArrayList.size(); i++) {
                                System.out.println(otoArrayList.get(i));
                            }
                            break;
                        case 3:
                            for (int i = 0; i < xeMayArrayList.size(); i++) {
                                System.out.println(xeMayArrayList.get(i));
                            }
                            break;
                        default:
                            System.out.println(" nhập sai");
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
                            System.out.println(" nhập năm sản xuất cần xóa cần xóa ");
                            int iDXoaXeTai = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < xeTaiArrayList.size(); i++) {
                                if (xeTaiArrayList.get(i).getNamSanXuat() == iDXoaXeTai) {
                                    xeTaiArrayList.remove(xeTaiArrayList.get(i));
                                }
                            }
                            break;
                        case 2:
                            // xóa xe ô to

                            break;
                        case 3:
                            // xóa xe máy


                            break;
                        default:
                            System.out.println(" nhập sai");
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
