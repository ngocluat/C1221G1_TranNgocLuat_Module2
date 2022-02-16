package Introduction_to_java.bai_tap;

import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int inputNumber = scanner.nextInt();
        switch (inputNumber) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("true");
                break;
            case 3:
                System.out.println("số ba");
                break;
            case 4:
                System.out.println("số bốn");
                break;
            case 5:
                System.out.println("số năm");
                break;
            case 6:
                System.out.println("số sáu");
                break;
            case 7:
                System.out.println("số bảy");
                break;
            case 8:
                System.out.println("số tám");
                break;
            case 9:
                System.out.println("số chín");
                break;
            case 10:
                System.out.println("số mười");
                break;
        }
    }
}
