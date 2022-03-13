package test_example.vi_du_nho.test;

import java.util.Arrays;

public class BaiTapBob {

    public static int[] swap(int[] arr) {

        int temp = arr[arr.length - 1]; // = 1
        arr[arr.length - 1] = arr[0];//1 gán -2
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] aarr = {1, 5, 10, -2};
        System.out.println(Arrays.toString(swap(aarr)));
    }
}