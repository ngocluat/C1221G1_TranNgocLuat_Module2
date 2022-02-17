package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" you want how many Prime");
        int numbers = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean flag = true;
            for (int j = 2; j < N; j++) {
                if (N % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(N +" ");
                count++;
            }
            N++;
        }

    }
}

