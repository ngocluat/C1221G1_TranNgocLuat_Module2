package case_study_module2.controllers;

import case_study_module2.model.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static int chose;
    static boolean flag = true;
    static List<Customer> khachHang = new LinkedList<>();

    public static void displayMainMenu() {
        do {
            System.out.println(" ______________XIN KÍNH CHÀO______________ \n" +
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
                e.printStackTrace();
            }
            switch (chose) {
                case 1:
                    ControllerEmployee.functionEmployee();
                    break;
                case 2:
                    ControllerServices.funcctionSevice();
                    break;
                case 3:
                    ControllerFacility.functionFaciliy();
                    break;
                case 4:
                    int Booking =0;
                            System.out.println("xin mời lựa chọn\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +// tạo hợp dồng
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                            try {
                                Booking = Integer.parseInt(scanner.nextLine());
                            }catch (NumberFormatException e ){
                                System.err.println(" bạn đã nhập chữ !!! yêu cầu nhập lại ");
                            }
                    switch (Booking) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 5:
                    int promotion =0;
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    try {
                        promotion = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e ){
                        System.out.println(" bạn nhập chữ !!!! yêu cầu nhập lại đúng số ");
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