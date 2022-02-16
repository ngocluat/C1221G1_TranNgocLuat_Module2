package Introduction_to_java.bai_tap;

import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        String result = "";
        int n = scanner.nextInt();
        int laySotram = n / 100;
        int laySoChuc = (n % 100) / 10;
        int layDonVi = (n % 100) % 10;
        switch (laySotram) {
            case 1:
                result += "một trăm ";
                break;
            case 2:
                result += "hai trăm ";
                break;
            case 3:
                result += " ba  trăm ";
                break;
            case 4:
                result += " bốn trăm ";
                break;
            case 5:
                result += " năm trăm ";
                break;
            case 6:
                result += " sáu trăm ";
                break;
            case 7:
                result += " bảy trăm ";
                break;
            case 8:
                result += " tám trăm ";
                break;
            case 9:
                result += " chín trăm ";
                break;
            default:
                result += "";
        }
        switch (laySoChuc) {
            case 1:
                result += "mười ";
                break;
            case 2:
                result += "hai mươi ";
                break;
            case 3:
                result += "ba mươi ";
                break;
            case 4:
                result += "bốn mươi ";
                break;
            case 5:
                result += "năm mươi ";
                break;
            case 6:
                result += "sáu mươi ";
                break;
            case 7:
                result += "bảy mươi ";
                break;
            case 8:
                result += "tám mươi ";
                break;
            case 9:
                result += "chín mươi ";
                break;
            default:
                result += "";
        }
        switch (layDonVi) {
            case 1:
                System.out.println(result += "một");
                break;
            case 2:
                System.out.println(result += "hai");
                break;
            case 3:
                System.out.println(result += "ba");
                break;
            case 4:
                System.out.println(result += "bốn");
                break;
            case 5:
                System.out.println(result += "năm");
                break;
            case 6:
                System.out.println(result += "sáu");
                break;
            case 7:
                System.out.println(result += "bảy");
                break;
            case 8:
                System.out.println(result += "tám");
                break;
            case 9:
                System.out.println(result += "chín");
                break;
            default:
                System.out.println(result += "");
        }
    }
}
