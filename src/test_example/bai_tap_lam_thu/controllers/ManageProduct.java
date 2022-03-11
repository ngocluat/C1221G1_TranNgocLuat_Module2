package test_example.bai_tap_lam_thu.controllers;

import test_example.bai_tap_lam_thu.services.FunctionProduct;

import java.util.Scanner;

public class ManageProduct {
    public static void work() {
        FunctionProduct functionProduct = new FunctionProduct();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" vui long chọn chức năng ");
            System.out.println("1.thêm product \n" +
                    "2. sửa product\n" +
                    "3. xóa product \n" +
                    "4. hiển thị product\n" +
                    "5. tìm kiếm\n" +
                    "6. thoát   ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    functionProduct.them();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    functionProduct.hienThi();
                    break;
                case 5:
                    functionProduct.timKiem();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
