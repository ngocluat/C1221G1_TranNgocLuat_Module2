package ss19_string_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class TestClassName {
    public static boolean checkClassname(String phone) {
        String regex = "^[ACP]([0-9]{4})[GHIKLM]$";
        return phone.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String classNanme;
        do {
            System.out.println(" nhập tên lớp kiểm trta có hợp lệ hay không ");
            classNanme = scanner.nextLine();
        } while (!TestClassName.checkClassname(classNanme));
        System.out.println(" thành công ");
    }
}
