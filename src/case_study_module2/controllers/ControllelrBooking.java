package case_study_module2.controllers;

import case_study_module2.services.serviceI_mpl.BookingServiceImlp;

import java.util.Scanner;

public class ControllelrBooking {
    static Scanner scanner = new Scanner(System.in);
    static BookingServiceImlp bookingServiceImlp = new BookingServiceImlp();

    public static void functionBooking() {

        int booking = 0;
        do {
        System.out.println("xin mời lựa chọn\n" +
                "1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +// tạo hợp dồng
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n" +
                "7. để thoát ");

            try {
                booking = Integer.parseInt(scanner.nextLine());
                if (booking > 0 && booking < 7){
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print(" bạn đã nhập chữ !!! yêu cầu nhập lại ");
            }

        } while (true);
        switch (booking) {
            case 1:
                bookingServiceImlp.add();
                break;
            case 2:
                bookingServiceImlp.display();
                break;
            case 3:
                bookingServiceImlp.createNewContract();
                break;
            case 4:
                bookingServiceImlp.displayListContract();
                break;
            case 5:
                bookingServiceImlp.editContract();
                break;
            case 6:
                break;
        }
    }
}
