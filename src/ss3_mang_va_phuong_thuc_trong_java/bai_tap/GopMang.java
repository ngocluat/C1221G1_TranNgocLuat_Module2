package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = array1();
        int[] arr2 = array2();
        int[] gopMang = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            gopMang[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            gopMang[arr1.length + i] = arr2[i];
        }
        System.out.print("\n mảng sau khi gộp là");
        System.out.print("\n" + Arrays.toString(gopMang));
    }

    public static int[] array1() {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        return array;
    }

    public static int[] array2() {

        int[] array;
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("\n" + "Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        return array;
    }
}