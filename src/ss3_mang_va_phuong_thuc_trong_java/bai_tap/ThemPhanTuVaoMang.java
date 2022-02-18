package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        System.out.println("enter the required number");
        int soThem = Integer.parseInt(scanner.nextLine());
        System.out.println("bạn jmuonns thêm ở đâu");
        int themOViTri = Integer.parseInt(scanner.nextLine());

            for (int i = arr.length-1; i > themOViTri ; i--) {
                arr[i] = arr[i - 1];
            }
            arr[themOViTri]=soThem;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}


//System.out.print("Nhập số phần tử của mảng: ");
//        int n = scanner.nextInt();
//        // khởi tạo arr
//        int [] arr = new int [n];
//        System.out.print("Nhập các phần tử của mảng: \n");
//        for (int i = 0; i < n; i++) {
//        System.out.printf("a[%d] = ", i);
//        arr[i] = scanner.nextInt();
//        }
//        System.out.print("Nhập phần tử k = ");
//        int k = scanner.nextInt();
//
//        int arrIndex = arr.length - 1;
//        int tempIndex = arr.length;
//        int[] tempArr = new int[tempIndex + 1];
//        boolean inserted = false;
//
//        for (int i = tempIndex; i >= 0; i--) {
//        if (arrIndex > -1 && arr[arrIndex] > k) {
//        tempArr[i] = arr[arrIndex--];
//        } else {
//        if (!inserted) {
//        tempArr[i] = k;
//        inserted = true;
//        } else {
//        tempArr[i] = arr[arrIndex--];
//        }
//        }
//        }
//        for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i] + " ");
//        }
//
//        }
