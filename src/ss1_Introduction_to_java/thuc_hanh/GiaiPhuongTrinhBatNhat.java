package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBatNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("'a * x + b = c', please enter constants:");

        System.out.println("enter A");
        double a = scanner.nextDouble();
        System.out.println("enter B");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation Pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.println(" phương trình có vô ssoa nghiệm");
            } else {
                System.out.println("not solution");
            }
        }

    }
}
