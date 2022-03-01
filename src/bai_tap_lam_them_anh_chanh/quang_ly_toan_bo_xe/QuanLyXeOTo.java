package bai_tap_lam_them_anh_chanh.quang_ly_toan_bo_xe;

import bai_tap_lam_them_anh_chanh.XeOto;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXeOTo {
 static    ArrayList<XeOto> otoArrayList = new ArrayList<>();
   static Scanner scanner = new Scanner(System.in);

    public static void themMoiXeOTo() {
        System.out.println("nhập biển số ");
        String bienSoOTo = scanner.nextLine();
        System.out.println("nhập hãng sản xuất ");
        String hangSanXuatOTo = scanner.nextLine();
        System.out.println("sản xuát năm");
        int namSanXuat0To = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu ");
        String chuSoHuuOto = scanner.nextLine();
        System.out.println(" nhập số chổ ngồi");
        int soChoNgoiXeOto = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập  kiểu xe ");
        String kieuXeOto = scanner.nextLine();
        otoArrayList.add(new XeOto(bienSoOTo, hangSanXuatOTo, namSanXuat0To, chuSoHuuOto, soChoNgoiXeOto, kieuXeOto));

    }
    public static void hienThiXeOTo(){
        for (int i = 0; i < otoArrayList.size(); i++) {
            System.out.println(otoArrayList.get(i));
        }
    }
    public static void xoaXeOTo( String bienSoOToXoa){

        for (int i = 0; i < otoArrayList.size(); i++) {
            if (otoArrayList.get(i).getBienKiemSoat().equals(bienSoOToXoa)) {
                otoArrayList.remove(otoArrayList.get(i));
            }
        }
    }
}
