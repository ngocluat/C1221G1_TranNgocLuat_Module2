package case_study_module2.controllers;

import case_study_module2.services.serviceI_mpl.EmployeeServiceImpl;

import java.util.Scanner;

public class ControllerEmployee {
    static Scanner scanner = new Scanner(System.in);

    public static void functionEmployee() {
        int employees = -1;
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        System.out.println("xin mời lựa chọn\n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");

        do {
            System.out.println(" nhập lựa chon của bạn ");
            try {
                employees = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("bạn đẵ nhập sai yêu cầu !! vào chương trình");
            }
        } while (employees <0 || employees >5);

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
        }
    }
}
