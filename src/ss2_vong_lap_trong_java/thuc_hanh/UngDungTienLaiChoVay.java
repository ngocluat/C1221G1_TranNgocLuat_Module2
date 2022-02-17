package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTienLaiChoVay {
    public static void main(String[] args) {
        double deposits, interest;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter deposits money amount");
        deposits = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += deposits * (interest/100)/12 * month;
        }
        System.out.println(totalInterest);
    }
}
