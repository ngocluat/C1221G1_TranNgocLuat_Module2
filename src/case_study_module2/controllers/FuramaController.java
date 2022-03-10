package case_study_module2.controllers;

import case_study_module2.model.Customer;
import case_study_module2.services.serviceI_mpl.CustomerServiceImpl;
import case_study_module2.services.serviceI_mpl.EmployeeServiceImpl;
import case_study_module2.services.serviceI_mpl.FacilityServiceImpl;

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
            System.out.println(" xin chào \n" +
                    "lựa chọn \n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCostumers Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
                    System.out.println("xin mời lựa chọn\n" +
                            "1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    int employees = Integer.parseInt(scanner.nextLine());
                    switch (employees) {
                        case 1:
                            employeeServiceImpl.display();
                            break;
                        case 2:
                            employeeServiceImpl.add();
                            break;
                        case 3:
                            employeeServiceImpl.edit();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println(" nhập sai ");
                    }
                    break;
                case 2:
                    CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    int customer = Integer.parseInt(scanner.nextLine());
                    switch (customer) {
                        case 1:
                            customerServiceImpl.display();
                            break;
                        case 2:
                            customerServiceImpl.add();
                            break;
                        case 3:
                            customerServiceImpl.edit();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    // chức năng 3
                    FacilityServiceImpl facilityService = new FacilityServiceImpl();
                    System.out.println("xin mời lựa chọn\n" +
                            "1\tDisplay list Ifacility\n" +
                            "2\tAdd new Ifacility\n" +
                            "3\tDisplay list Ifacility maintenance\n" +
                            "4\tReturn main menu\n");
                    int facility = Integer.parseInt(scanner.nextLine());
                    switch (facility) {
                        case 1:
                            facilityService.display();
                            break;
                        case 2:
                            System.out.println("add.\n" +
                                    "1.\tAdd New Villa\n" +
                                    "2.\tAdd New House\n" +
                                    "3.\tAdd New Room\n" +
                                    "4.4.\tBack to menu");
                            System.out.println(" nhập Facility bạn muốn thêm ");
                            int add = Integer.parseInt(scanner.nextLine());
                            switch (add){
                                case 1:
                                    facilityService.addVilla();
                                    break;
                                case 2:
                                    facilityService.addHouse();
                                    break;
                                case 3:
                                    facilityService.addRoom();
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                        case 3:
                            facilityService.displayListmaintenance();
                            break;
                        case 4:
                            break;

                    }
                    break;
                case 4:
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +// tạo hợp dồng
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    int Booking = Integer.parseInt(scanner.nextLine());
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
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int promotion = Integer.parseInt(scanner.nextLine());
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