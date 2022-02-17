package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("you want check month có how many day");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("month " + month + " có 31 day");
                break;
            case 2:
                System.out.println(" month " + month + " có 28 or 29 day");
                break;
            case 4:
            case 6:
            case 10:
                System.out.println("month " + month + " có 30 day");
                break;
            default:
                System.out.println("you import wrong month");
        }
    }
}
