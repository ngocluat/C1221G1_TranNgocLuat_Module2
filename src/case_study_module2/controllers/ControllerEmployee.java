package case_study_module2.controllers;

import case_study_module2.services.serviceI_mpl.EmployeeServiceImpl;

import java.util.Scanner;

public class ControllerEmployee {
    static Scanner scanner= new Scanner(System.in);
    public  static  void functionEmployee(){
        int employees= 0;
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        System.out.println("xin mời lựa chọn\n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        try {
            employees = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.err.println("bạn đẵ nhập chữ vào chương trình");
        }

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
    }
}
