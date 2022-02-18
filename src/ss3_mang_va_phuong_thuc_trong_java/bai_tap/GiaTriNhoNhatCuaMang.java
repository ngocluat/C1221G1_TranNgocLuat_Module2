package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GiaTriNhoNhatCuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số luownhj phần tử cải mảng ");

        int soLuong = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println(" mảng của bạn  là");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("\nphần tử nhỏ nhất cuaur mảng là  ");
        System.out.print(min);


    }
}
