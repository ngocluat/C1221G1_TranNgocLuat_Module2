package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        boolean flaf = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\ndisplay menu ");
            System.out.println(" 1. rectangle \n" +
                    "2. isosceles triangle\n" +
                    "3. isosceles triangle reverse\n" +
                    "3. isosceles triangle cân\n" +
                    "4. exit");
            int nhap = Integer.parseInt(scanner.nextLine());
            switch (nhap) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("*");
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println("*");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 10; i++) {
                        for (int k = 10; k > i; k--) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            if (i == 1 || i == 10 || j == 1 || j == i * 2 - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    flaf = false;
                    break;
            }
        }
        while (flaf);
    }
}
