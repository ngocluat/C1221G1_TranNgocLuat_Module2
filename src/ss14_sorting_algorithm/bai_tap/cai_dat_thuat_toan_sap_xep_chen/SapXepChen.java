package ss14_sorting_algorithm.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class SapXepChen {

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,8,7,4,1,100};
        SapXepChen.insertionSort(array);
    }
}