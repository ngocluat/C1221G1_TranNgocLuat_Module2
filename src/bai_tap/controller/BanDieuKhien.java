package bai_tap.controller;

import bai_tap.services.ChucNang;

import java.util.Scanner;

public class BanDieuKhien {
    static Scanner scanner= new Scanner(System.in);
 static    ChucNang chucNang= new ChucNang();
    public static void managementFunction(){
        boolean flag = true;
        int choise=0;
        do {
            System.out.println("" +
                    "--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN–\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các bệnh án\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:\n");
            try {
                choise= Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println(" bạn nhập không chính xát !!");
            }
            switch (choise){
                case 1:
                    System.out.println("bạn muốn thêm bận nhân nào\n" +
                            "1. bệnh nhân thường\n" +
                            "2. bệnh nhân vip\n" +
                            "3 thoát  ");
                    int choiseCostomer = -1;
                    while ( choiseCostomer < 0||choiseCostomer > 3)  {
                        try {
                            System.out.println(" nhập lựa chọn của bạn ");
                            choiseCostomer = Integer.parseInt(scanner.nextLine());
                            if(choiseCostomer>3){
                                System.out.println("bạn nhập sai ");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Exception");
                        }
                    }
                    switch (choiseCostomer){
                        case 1:
                            chucNang.themBenNhanThuong();
                            break;
                        case 2:
                            chucNang.themBenNhanVip();
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    chucNang.xoa();
                    break;
                case 3:
                    chucNang.hienThi();
                    break;
                case 4:
                    flag =false;
            }
        }while (flag);
    }
}
