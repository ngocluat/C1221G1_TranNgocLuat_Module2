package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienTrongMang {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = false;
        String tenCuaTui = "tranngocluataaaaaaaaa";
        String tenCuaTuii[] = tenCuaTui.split("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character you want to find");
        String tim = scanner.nextLine();
        for (int i = 0; i < tenCuaTuii.length; i++) {
            if (tenCuaTuii[i].equals(tim)) {
                flag = true;
                count++;
            }
        }
        if (flag) {
            System.out.println(" số lần xuất hiện của " + tim + " là " + count);
        } else {
            System.out.println("không tìm thấy ");
        }

    }
}
