package ss14_sorting_algorithm.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;


import java.util.Arrays;

public class MinhHoa {
    public static void insertionSort(int[] array) {
        System.out.println("                             array chưa được sắp xếp "+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
         int inDexMin = i;
            for (int j = i+1 ; j <array.length ; j++) {
             if (array[j]<array[inDexMin]){
                 inDexMin= j;
             }
            }
            if (inDexMin!= i){
                int temp = array[i];
                array[i]=array[inDexMin];
                array[inDexMin]= temp;
            }
            System.out.println("lần thứ "+i+": "+Arrays.toString(array));
        }
        System.out.println("                                     result"+ Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 8, 7, 4, 1, 100};
        MinhHoa.insertionSort(array);
    }
}
