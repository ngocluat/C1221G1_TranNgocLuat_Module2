package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimKiTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cars = {"hundai", "kia", "honda", "benz", "toyota"};
        System.out.println("Enter the car you want to find");
        String timKiemXe = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < cars.length; i++) {
            if (timKiemXe.equals(cars[i])) {
                System.out.println(" xin chào " + timKiemXe);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + timKiemXe + " in the list.");
        }
    }
}
