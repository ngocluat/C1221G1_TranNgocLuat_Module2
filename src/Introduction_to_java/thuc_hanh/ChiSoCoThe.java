package Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ChiSoCoThe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight, height, bMI;
        System.out.println("enter height(kilogram)");
        weight=scanner.nextDouble();
        System.out.println("enter weight(meter)");
        height=scanner.nextDouble();
        bMI = weight / Math.pow(height, 2);
        
        if (bMI < 18)
            System.out.printf("%-20.2f%s", bMI, "Underweight");
        else if (bMI < 25.0)
            System.out.printf("%-20.2f%s", bMI, "Normal");
        else if (bMI < 30.0)
            System.out.printf("%-20.2f%s", bMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", bMI, "Obese");
    }
}
