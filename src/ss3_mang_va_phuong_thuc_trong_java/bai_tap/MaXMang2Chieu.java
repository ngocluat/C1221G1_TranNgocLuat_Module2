package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MaXMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số dòng");
        int dong = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập số cột");
        int cot = Integer.parseInt(scanner.nextLine());
        int[][] mang2Chieu = new int[dong][cot];

        for (int i = 0; i < mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[i].length; j++) {
                System.out.print(" nhập phần tử cho mảng 2 chiều thứ  " + i + j);
                mang2Chieu[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }


        int max = mang2Chieu[0][0];
        for (int i = 0; i < mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[i].length; j++) {
                if (mang2Chieu[i][j] > max) {
                    max = mang2Chieu[i][j];
                }
            }
        }
        System.out.println("tìm số lớn nhất có  trong mảng");
        System.out.println("số lốn nhất  trong mảng 2 chiều là  " + max);
    }
}