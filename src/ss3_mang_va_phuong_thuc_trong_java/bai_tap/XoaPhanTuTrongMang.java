package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 7, 5, 6, 7};
        System.out.println(" nhập số muốn xóa");
        int soMuonXoa = Integer.parseInt(scanner.nextLine());
        //tìm xem số trong mang ko
        int idex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == soMuonXoa) {
                idex = i;
                System.out.println("âja" + i);
//                break;
            }

        }
        if (idex != -1) {
            for (int i = idex; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = 0;

            System.out.println("deleted array is");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("không tìm thấy số" + soMuonXoa + " trong mảng ");
        }


    }
}
