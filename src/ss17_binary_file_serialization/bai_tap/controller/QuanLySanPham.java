package ss17_binary_file_serialization.bai_tap.controller;

import ss17_binary_file_serialization.bai_tap.services.FunctionManagement;

import java.util.Scanner;

public class QuanLySanPham {
    static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    FunctionManagement functionManagement = new FunctionManagement();
    public void quanLy() {
        do {
            System.err.println(" nhập lựa chon của bạn \n" +
                    "1. thêm \n" +
                    "2. hiển thị\n" +
                    "3. xóa\n" +
                    "4. thoát  ");
            int luaChon= Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    functionManagement.them();
                    break;
                case 2:
                    functionManagement.hienThi();
                    break;
                case 3:
                    functionManagement.xoa();
                    break;
                case 4:
                    flag= false;
                    break;

            }
        } while (flag);
    }
}
