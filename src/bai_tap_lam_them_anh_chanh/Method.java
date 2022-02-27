package bai_tap_lam_them_anh_chanh;

import java.util.Scanner;

public class Method {
    public void themMoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " nhập trọng tải");
        int trongTai = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập biển số ");
        String bienSo = scanner.nextLine();
        System.out.println("nhập hãng sản xuất ");
        String hangSanXuat  = scanner.nextLine();
        System.out.println("sản xuát năm");
        int namSanXuat  = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu ");
        String chuSoHuu = scanner.nextLine();
    }
}
