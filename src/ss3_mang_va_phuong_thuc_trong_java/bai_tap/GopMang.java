package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] mang11 = mang1();
        int[] mang22 = mang22();
        int[] gopMang = new int[mang11.length + mang22.length];
        for (int i = 0; i < mang11.length; i++) {
            gopMang[i] = mang11[i];
        }
        for (int i = 0; i < mang22.length; i++) {
            gopMang[mang11.length + i] = mang22[i];
        }
        System.out.print("\n mảng sau khi gộp là");
        System.out.print("\n" + Arrays.toString(gopMang));
    }

    public static int[] mang1() {

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

    public static int[] mang22() {

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