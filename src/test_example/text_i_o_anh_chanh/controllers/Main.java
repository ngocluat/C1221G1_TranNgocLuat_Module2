package test_example.text_i_o_anh_chanh.controllers;


import test_example.text_i_o_anh_chanh.services.impl.StudentServiceImpl;

import java.util.Scanner;

public class Main {
    static StudentServiceImpl studentService = new StudentServiceImpl();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.println("Main Menu: " +
                    "1. add\n" +
                    "2. display\n" +
                    "3.edit\n" +
                    "4.delete\n" +
                    "5.search\n" +
                    "6.exit\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1:
                    //chức năng thêm ới
                    studentService.add();
                    break;
                case 2:
                    //chức năng hiện thi
                    System.out.println("display danh sách sinh viên");
                    studentService.display();

                    break;
                case 3:
                    //chức năng thêm sửa
                    System.out.println("edit");
                    studentService.edit();
                    break;
                case 4:
                    //xóa
                    System.out.println("delete");
                    studentService.delete();
                    break;
                case 5:
                    //chức năng tìm kiếm
                    System.out.println("search");
                    break;
                default:
                    flag = false;

            }
        }while (flag);
    }
}
