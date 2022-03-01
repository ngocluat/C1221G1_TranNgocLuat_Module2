package bai_tap_lam_them_anh_chanh.quang_ly_toan_bo_xe;


import bai_tap_lam_them_anh_chanh.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXeTai {
    static ArrayList<XeTai> xeTaiArrayList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);



    public static void themXeTai() {
        System.out.println("nhập biển số ");
        String bienSo = scanner.nextLine();
        System.out.println("nhập hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("sản xuát năm");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu ");
        String chuSoHuu = scanner.nextLine();
        System.out.println(" nhập trọng tải");
        int trongTai = Integer.parseInt(scanner.nextLine());
        xeTaiArrayList.add(new XeTai(bienSo, hangSanXuat, namSanXuat, chuSoHuu, trongTai));
    }

    public static void hienThiXeTai() {
        for (int i = 0; i < xeTaiArrayList.size(); i++) {
            System.out.println(xeTaiArrayList.get(i));
        }

    }

    public static void xoaXeTai(String iDXoaXeTai) {


            for (int i = 0; i < xeTaiArrayList.size(); i++) {
                if (xeTaiArrayList.get(i).getBienKiemSoat().equals(iDXoaXeTai)) {
                    xeTaiArrayList.remove(xeTaiArrayList.get(i));
                }

        }
    }

}
