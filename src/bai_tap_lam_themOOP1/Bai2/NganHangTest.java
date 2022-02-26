package bai_tap_lam_themOOP1.Bai2;

import java.util.Comparator;
import java.util.Scanner;

public class NganHangTest  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NganHangABC nganHangABC1 = new NganHangABC(1234, " trần ngọc luật", 12000);
        NganHangABC nganHangABC2 = new NganHangABC(4444, " trần linh", 10000);
        NganHangABC nganHangABC3 = new NganHangABC(9876, " trần lúc ", 5000);
        NganHangABC[] nganHang = {nganHangABC1, nganHangABC2, nganHangABC3};
        for (NganHangABC element : nganHang) {
            System.out.println(element);
        }
        System.out.println(" nập tiền ");
        nganHangABC1.napTien(5555);
        nganHangABC2.napTien(100);
        nganHangABC3.napTien(-1);
        for (NganHangABC elementSau : nganHang) {
            System.out.println(elementSau);
        }
        System.out.println(" ri=út tiền");
        System.out.println(" nhập số tiền bạn muốn rút ở ngân hàng ABC1 ");
        double soTienRut = Integer.parseInt(scanner.nextLine());
        nganHangABC1.rutTien(soTienRut);
        System.out.println(nganHangABC1);

        System.out.println(" đáo hạn");
        nganHangABC2.daoHan();
        System.out.println(nganHangABC2);

        System.out.println(" chuuyeenr tiền từ ngân hàng này sang ngaanhang khác ");
//        nganHangABC2.chuyenTien(1000, nganHangABC1);
//        System.out.println( nganHangABC1);




    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        NganHangABC nganHangABC1 = (NganHangABC) o1;
//        NganHangABC nganHangABC2 = (NganHangABC) o2;
//        if (nganHangABC1.getSoTienTrongTaiKhoan() == nganHangABC2.getSoTienTrongTaiKhoan()) {
//            return 0;
//        } else if (nganHangABC1.getSoTienTrongTaiKhoan() > nganHangABC2.getSoTienTrongTaiKhoan()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
}
