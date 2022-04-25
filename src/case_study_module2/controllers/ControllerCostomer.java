package case_study_module2.controllers;

import case_study_module2.services.serviceI_mpl.CustomerServiceImpl;

import java.util.Scanner;

public class ControllerCostomer {
    static Scanner scanner = new Scanner(System.in);

    public static void funcctionSevice() {
        int customer = 0;
        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
        System.out.println("xin mời lựa chọn\n" +
                "1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        do {
            try {
                System.out.print("nhập lựa chon của bạn");
                customer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" bạn nhập sai lựa chọn !! yêu cầu nhập lại");
            }
        } while (customer < 0 || customer > 5);

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
    }
}
