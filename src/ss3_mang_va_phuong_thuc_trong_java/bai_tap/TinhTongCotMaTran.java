package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCotMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;


        System.out.println(" nhập số dòng");
        int dong = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập số cột");
        int cot = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[dong][cot];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" nhập phần tử cho mảng 2 chiều dòng  " + (i + 1) + " cột   " +(j + 1));
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("bạn muốn tính tổng cảu cột nào");
        System.out.println(" cột thứ nhất mấy");

        int nhap = Integer.parseInt(scanner.nextLine());
        if (nhap > 0 && nhap <= cot) {
            int tong = tinhTongCot(array, nhap - 1);
            System.out.println(tong);
        } else {
            System.out.println("bạn nhập sai  ");
        }
    }

    public static int tinhTongCot(int[][] array, int viTri) {
        int sumCot1 = 0;
        for (int i = 0; i < array.length; i++) {
            sumCot1 += array[i][viTri];
        }
        return sumCot1;
    }

}
