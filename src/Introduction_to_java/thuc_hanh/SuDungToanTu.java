package Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        float acreage;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("enter width");
        width = Scanner.nextFloat();
        System.out.println("enter hight");
        height = Scanner.nextFloat();
        acreage = (width * height);
        System.out.println(acreage);
    }
}
