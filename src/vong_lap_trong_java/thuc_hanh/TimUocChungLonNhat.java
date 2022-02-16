package vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter số A");
        int soA = Integer.parseInt(scanner.nextLine());
        System.out.println("enter number B");
        int soB = Integer.parseInt(scanner.nextLine());
        soA = Math.abs(soA);
        soB = Math.abs(soB);
        if (soA == 0 || soB == 0) {
            System.out.println("No greatest common factor");
        } else {
            if (soA > soB) {
                soA = soA - soB;
            } else {
                soB = soB - soA;
            }
        }
        System.out.println("Greatest common factor: " + soA);
    }


}
