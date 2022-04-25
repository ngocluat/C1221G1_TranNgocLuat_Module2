package case_study_module2.controllers;

import case_study_module2.model.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Furama {
    static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    static List<Customer> khachHang = new LinkedList<>();

    public static void displayMainMenu() {
        int chose = -1;
        do {
            System.out.println("                     ______________XIN KÍNH CHÀO______________ \n" +
                    "lựa chọn \n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCostumers Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            try {
                chose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("!!! yêu cầu nhập  dúng  ");
            }
                switch (chose) {
                    case 1:
                        ControllerEmployee.functionEmployee();
                        break;
                    case 2:
                        ControllerCostomer.funcctionSevice();
                        break;
                    case 3:
                        ControllerFacility.functionFaciliy();
                        break;
                    case 4:
                      ControllelrBooking.functionBooking();
                        break;
                    case 5:
                        int promotion = 0;
                        System.out.print("xin mời lựa chọn\n" +
                                "1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        try {
                            promotion = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.print(" bạn nhập chữ !!!! yêu cầu nhập lại đúng số ");
                        }
                        switch (promotion) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 6:
                        flag = false;
                        break;
                }


        } while (flag);
    }



}