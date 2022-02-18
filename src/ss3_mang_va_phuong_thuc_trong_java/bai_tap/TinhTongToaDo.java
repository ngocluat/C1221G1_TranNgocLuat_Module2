package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongToaDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số dòng");
        int dong = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập số cột");
        int cot = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[dong][cot];
        if (dong == cot){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(" nhập phần tử cho dòng thứ " + (i+1) + " ô thứ " + (j+1));
                    arr[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
        }else {
            System.out.println("hanhg và cộ không phải hình vuông ");
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
