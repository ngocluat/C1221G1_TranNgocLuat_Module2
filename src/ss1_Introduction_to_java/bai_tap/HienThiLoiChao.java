package ss1_Introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String inputName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name");
        inputName = scanner.nextLine();
        System.out.println("hello " + inputName);
    }
}
