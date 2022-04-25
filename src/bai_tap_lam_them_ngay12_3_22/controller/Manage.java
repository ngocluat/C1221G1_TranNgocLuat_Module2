package bai_tap_lam_them_ngay12_3_22.controller;

import bai_tap_lam_them_ngay12_3_22.services.function_manage.quan_ly.QuanLyXeMay;
import bai_tap_lam_them_ngay12_3_22.services.function_manage.quan_ly.QuanLyXeOTo;
import bai_tap_lam_them_ngay12_3_22.services.function_manage.quan_ly.QuanLyXeTai;

import java.util.Scanner;

public class Manage {
    public static void function() {
        QuanLyXeTai quanLyXeTai = new QuanLyXeTai();
        QuanLyXeOTo quanLyXeOTo = new QuanLyXeOTo();
        QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("vui lòng chọn chức năng\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    // thêm mớ -i
                    System.out.println(" bạn muốn thêm mới xe gì \n" +
                            "1. Thêm xe tải,\n" +
                            "2. Thêm ôtô, \n" +
                            "3. Thêm  xe máy.\n");
                    int choseAddCar = Integer.parseInt(scanner.nextLine());


                    switch (choseAddCar) {
                        case 1:
                            quanLyXeTai.them();
                            break;
                        case 2:
                            quanLyXeOTo.them();
                            break;
                        case 3:
                            quanLyXeMay.them();
                            break;

                    }
                    break;
                case 2:
                    //  hiển thị
                    System.out.println("hiển thị \n " +
                            "1. Hiện thị xe tải.\n" +
                            "2. Hiện thị ôtô. \n" +
                            "3. Hiện  xe máy.\n");
                    int choseDisplay = Integer.parseInt(scanner.nextLine());
                    switch (choseDisplay) {
                        case 1:
                            quanLyXeTai.hienThi();
                            break;
                        case 2:
                            quanLyXeOTo.hienThi();
                            break;
                        case 3:
                            quanLyXeMay.hienThi();
                            break;
                    }
                    break;
                case 3:
                    // xóa
                    System.out.println("bạn muốn xoa xe nào \n" +
                            "1. xóa xe tải\n" +
                            "2. xóa xe ô tô \n" +
                            "3. xóa xe máy ");
                    int deleteCar = Integer.parseInt(scanner.nextLine());
                    switch (deleteCar) {
                        case 1:
                            quanLyXeTai.xoa();
                            quanLyXeTai.hienThi();
                            break;
                        case 2:
                            quanLyXeOTo.xoa();
                            quanLyXeOTo.hienThi();
                            break;
                        case 3:
                            quanLyXeMay.xoa();
                            quanLyXeMay.hienThi();
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
