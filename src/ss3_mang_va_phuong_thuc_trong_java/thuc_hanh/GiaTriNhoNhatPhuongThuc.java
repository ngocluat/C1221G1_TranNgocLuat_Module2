package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class GiaTriNhoNhatPhuongThuc {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int minmin=hamMIn(arr);
        System.out.println("The smallest element in the array is: " + arr[minmin]);
    }

    public static int hamMIn(int[] arrr) {
        int min = arrr[0];
        for (int i = 0; i < arrr.length; i++) {
            if (min < arrr[i]) {
                arrr[i] = min;
            }
        }
        return min;
    }
}
