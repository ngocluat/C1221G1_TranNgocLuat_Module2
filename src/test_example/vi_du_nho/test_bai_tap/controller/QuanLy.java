package test_example.vi_du_nho.test_bai_tap.controller;

import test_example.vi_du_nho.test_bai_tap.sevicer.ChucNang;

import java.util.Scanner;

public class QuanLy {

    public  static void aaaa() {
       Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        ChucNang chucNang = new ChucNang();
        do {
            System.out.println(" nhập 1> add \n" +
                    "2. hiển thị \n" +
                    "3. thoát ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                    break;

            }
        } while (flag);
    }


    public  void add() {
//        int id = Integer.parseInt(scanner.Nexline());
    }
}
