package vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTienLaiChoVay {
    public static void main(String[] args) {
        double loan,month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter loan money amount");
        loan = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
    }
}
