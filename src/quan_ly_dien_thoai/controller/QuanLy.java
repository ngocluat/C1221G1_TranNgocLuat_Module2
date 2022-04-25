package quan_ly_dien_thoai.controller;

import quan_ly_dien_thoai.service.ChucNang;

import java.util.Scanner;

public class QuanLy {
    static Scanner scanner = new Scanner(System.in);
    static ChucNang chucNang = new ChucNang();

    public static void managementFunction() {
        boolean flag = true;
        int choise = 0;

        do {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI –\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách điện thoại\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng:\n");
            try {
                choise = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" bạn nhập không chính xát !!");
            }
            switch (choise) {
                case 1:

                    do {
                        System.out.println("nhập lựa chọn của bạn \n" +
                                "1. thêm mới điện thoại xách tay \n" +
                                "2. thêm mới điện thoại chính hãng \n" +
                                "3. thoát ");

                        try {
                            choise = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(" bạn nhập không chính xát !!");
                        }
                    } while (choise < 0 || choise > 3);
                    switch (choise) {
                        case 1:
                            chucNang.themDienThoaiXachTay();
                            break;
                        case 2:
                            chucNang.themDienThoaiChinhHang();
                            break;
                    }
                    break;
                case 2:
                    chucNang.xoa();
                    break;
                case 3:
                    chucNang.hienThhi();
                    break;
                case 4:
                    chucNang.tim();
                    break;
                case 5:
                    flag = false;
                default:
                    System.out.println(" bạn nhập không chính xát ");
            }
        } while (flag);
    }
}
