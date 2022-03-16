package case_study_module2.controllers;

import case_study_module2.services.serviceI_mpl.FacilityServiceImpl;

import java.util.Scanner;

public class ControllerFacility {
    static Scanner scanner= new Scanner(System.in);
public  static  void functionFaciliy(){
    int facility= 0;
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    System.out.println("xin mời lựa chọn\n" +
            "1\tDisplay list IFacility\n" +
            "2\tAdd new IFacility\n" +
            "3\tDisplay list IFacility maintenance\n" +
            "4\tReturn main menu\n");
    try {
        facility = Integer.parseInt(scanner.nextLine());

    }catch (NumberFormatException e ){
        System.err.println(" bạn nhập chữ nhập lại di");
    }
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
}
}
