package bai_tap_lam_them_anh_chanh.services;

import bai_tap_lam_them_anh_chanh.model.XeMay;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXeMay {
    static ArrayList<XeMay> xeMayArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void themMoiXeMay() {
        System.out.println("nhập biển số ");
        String bienSoXeMay = scanner.nextLine();
        System.out.println("nhập hãng sản xuất ");
        String hangSanXuatXeMay = scanner.nextLine();
        System.out.println("sản xuát năm");
        int namSanXuatXeMay = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu ");
        String chuSoHuuXeMay = scanner.nextLine();
        System.out.println(" nhập số coong xuất ");
        int congXuatXeMay = Integer.parseInt(scanner.nextLine());

        xeMayArrayList.add(new XeMay(bienSoXeMay, hangSanXuatXeMay, namSanXuatXeMay, chuSoHuuXeMay, congXuatXeMay));

    }

    public static void hienThiXeMay() {
        for (int i = 0; i < xeMayArrayList.size(); i++) {
            System.out.println(xeMayArrayList.get(i));
        }
    }

    public static void xoaXeMay(String bienSoXeMayMuonXoa) {

        for (int i = 0; i < xeMayArrayList.size(); i++) {
            if (xeMayArrayList.get(i).getBienKiemSoat().equals(bienSoXeMayMuonXoa)) {
                xeMayArrayList.remove(xeMayArrayList.get(i));
            }
        }
    }
}
