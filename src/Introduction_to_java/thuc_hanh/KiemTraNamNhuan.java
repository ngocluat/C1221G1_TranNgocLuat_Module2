package Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter in year");
        year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " in leap year");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("not a leap year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("ís leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}
