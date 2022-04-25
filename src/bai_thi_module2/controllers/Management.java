package bai_thi_module2.controllers;

import bai_thi_module2.services.FunctionManager;
import bai_thi_module2.services.NotFoundStudentExcaption;

import java.util.Scanner;

public class Management {
    static Scanner scanner = new Scanner(System.in);
    static FunctionManager functionManager = new FunctionManager();
    public static void managementFunction() {
        boolean flag = true;
        int choise = 0;
        do {
            System.out.println("xin chào\n" +
                    "1. thêm mối sinh viên\n" +
                    "2. xóa sinh viên\n" +
                    "3. xem danh sách sinh viên\n" +
                    "4. xem thông tin giáo viên\n" +
                    "5. tìm kiếm sinh viên \n" +
                    "6. thoát ");
            try {
                choise = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" bạn nhập không chính xát !!");
            }
            switch (choise) {
                case 1:
                    functionManager.themMoiSinhVien();
                    break;
                case 2:
                    try {
                        functionManager.xoaSinhVien();
                    } catch (NotFoundStudentExcaption notFoundStudentExcaption) {
                        notFoundStudentExcaption.printStackTrace();
                    }
                    break;
                case 3:
                    functionManager.xemDanhScahSinhVien();
                    break;
                case 4:
                    functionManager.xemThongTinGiaoVien();
                    break;
                case 5:
                    functionManager.timKiemSinhVien();
                    break;
                case 6:
                    flag = false;
            }
        } while (flag);
    }
}
