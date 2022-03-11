package ss19_string_regex.bai_tap.validate_phone_number;

import java.util.Scanner;

public class Test {
    public static boolean checkPhone(String phone) {
        String regex = "^\\((\\d{2})\\)-\\(\\d{10}\\)$";
        return phone.matches(regex);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println(" nhập số điện thoại");
            phone = scanner.nextLine();
        } while (!Test.checkPhone(phone));
        System.out.println(" thành công ");
    }
}
