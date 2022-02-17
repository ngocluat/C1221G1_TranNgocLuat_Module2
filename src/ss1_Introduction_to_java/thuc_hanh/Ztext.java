package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Ztext {

    public static void main(String[] args) {
        String matKhau = "luat";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập paswwork");
            String nhap = scanner.nextLine();
            if (nhap.equals(matKhau)) {
                break;
            }
        } while (true);
        {
            System.out.println("hello");
        }
    }
}
