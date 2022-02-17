package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so;
        System.out.println(" enter a number");
        so = Integer.parseInt(scanner.nextLine());

        if (so < 2) {
            System.out.println("is not a prime number");
        } else {
            boolean flag = true;
            for (int i = 2; i < so; i++) {
                if (so % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("a prime number");
            } else {
                System.out.println(" is not a pream numner ");
            }
        }
    }
}
