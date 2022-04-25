package bai_tap_1.controllers;

import bai_tap_1.service.FunctionCosstomer;
import bai_tap_1.service.FunctionHoaDon;

import java.util.Scanner;

public class Programmer {
    static Scanner scanner = new Scanner(System.in);
    static FunctionCosstomer functionCosstomer = new FunctionCosstomer();
 static FunctionHoaDon functionHoaDon= new FunctionHoaDon();
    public static void managementFunction() {
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1. Thêm mới khách hàng.\n" +
                    "2. Hiện thị thông tin khách hàng\n" +
                    "3. Tìm kiếm khách hàng\n" +
                    "4. Thêm mới hóa đơn\n" +
                    "5. Chỉnh sửa hóa đơn\n" +
                    "6. Hiện thị thông  tin chi tiết hóa đơn\n" +
                    "7. Thoát\n");
            int choise = -1;

            try {
                choise = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" requires correct input !! ");
            }
            switch (choise) {
                case 1:
                    System.out.println(" bạn muốn thêm khách hàng nào\n " +
                            "1. khách hàng việt nam\n " +
                            "2. khách hàng nước ngoài\n" +
                            "3. ra menu chính ");
                    int choiseCostomer = -1;
                    while (choiseCostomer < 0 || choiseCostomer > 3) {
                        try {
                            System.out.println(" nhập lựa chọn của bạn ");
                            choiseCostomer = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Exception");
                        }
                    }
                    switch (choiseCostomer) {
                        case 1:
                            functionCosstomer.addVN();
                            break;
                        case 2:
                            functionCosstomer.addNN();
                            break;
                    }
                    break;
                case 2:
                    functionCosstomer.display();
                    break;
                case 3:
                    functionCosstomer.seaching();
                    break;
                case 4:
                    functionHoaDon.themHoaDon();
                    break;
                case 5:
                    functionHoaDon.suaHoaDon();
                    break;
                case 6:
                    functionHoaDon.hienthi();
                    break;
                case 7:
                    flag = false;
            }
        } while (flag);
    }

}
