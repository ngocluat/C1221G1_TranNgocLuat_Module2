package bai_tap_1.service;

import bai_tap_1.models.CostomerNN;
import bai_tap_1.models.CostomerVN;
import bai_tap_1.models.ThongTinHoaDon;
import bai_tap_1.util.ReadWriteFIle;

import java.util.List;
import java.util.Scanner;

public class FunctionHoaDon implements IHoaDon {
    CostomerNN costomerNN = new CostomerNN();
    CostomerVN costomerVN = new CostomerVN();
    static List<ThongTinHoaDon> thongTinHoaDons = null;

    static {
        thongTinHoaDons = ReadWriteFIle.readListThongTinHoaDon();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void themHoaDon() {
        int maHoaDon;
        if (thongTinHoaDons.size() == 0) {
            maHoaDon = 1;
        } else {
            maHoaDon = (thongTinHoaDons.get(thongTinHoaDons.size() - 1).getMaHoaDon()) + 1;
        }
        System.out.println(" mã khách hàng ");
        String maKhachHang = scanner.nextLine();
        System.out.println(" ngyaf ra hóa đơn");
        String ngayRaHoaDon = scanner.nextLine();
        System.out.println(" số lượng ");
        double soluong = Double.parseDouble(scanner.nextLine());
        System.out.println(" đơn giá ");
        double donGia = Double.parseDouble(scanner.nextLine());
        double thanhTien = 0;
        //+ Khách hàng Việt Nam: Nếu số lượng <= định mức tiêu thụ thì: thành tiền = số lượng * đơn giá.
        // Ngược lại thì: thành tiền = số lượng * đơn giá * định mức tiêu thụ + số lượng KW vượt định mức
        // * Đơn giá * 2.5.
        //+ Khách hàng nước ngoài: Thành tiền được tính = số lượng * đơn giá.

//        if (costomerVN){
//        if (soluong<=donGia){
//            thanhTien= soluong* donGia;
//        }else {
//
//        }
//        else if (){
//        }
//        }
        ThongTinHoaDon thongTinHoaDon = new ThongTinHoaDon(maHoaDon, maKhachHang, ngayRaHoaDon, soluong, donGia, thanhTien);
        thongTinHoaDons.add(thongTinHoaDon);
        ReadWriteFIle.writeListString("src\\bai_tap_1\\data\\hoaDonKhachHang.csv", thongTinHoaDons, false);
    }

    @Override
    public void hienthi() {
        if (thongTinHoaDons.size() == 0) {
            System.out.println(" hình như danh sách hóa đơn không có gì  ");
        } else {
            for (ThongTinHoaDon item : thongTinHoaDons) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void suaHoaDon() {
        System.out.println("nhập id hóa đơn bạn muốn sửa ");
        int idSua = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (ThongTinHoaDon item : thongTinHoaDons) {
            if (item.getMaHoaDon() == idSua) {
                do {
                    System.out.println(" bạn muốn sửa cái nào \n" +
                            "1. sửa mã khách hàng" +
                            "2. ngày ra hóa đơn\n" +
                            "3. số lượng  ");
                    int choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            System.out.println(" sửa mã khách hàng ");
                            String maKhachHang = scanner.nextLine();
                            item.setMaKhachHang(maKhachHang);
                            break;
                        case 2:
                            System.out.println("nhập ngày ra hóa đơn");
                            String ngayRaHoaDon = scanner.nextLine();
                            item.setNgayRaHoaDon(ngayRaHoaDon);
                            break;
                        case 3:
                            System.out.println("sửa số lượng ");
                            double soLuong = Double.parseDouble(scanner.nextLine());
                            item.setDonGia(soLuong);
                            break;
                    }
                    System.out.println(" banjn có muốn sửa tiếp không Y/N`??");

                } while ("y".equals(scanner.nextLine().toLowerCase()));
                flag = true;
            }
            ReadWriteFIle.writeListString("src\\bai_tap_1\\data\\hoaDonKhachHang.csv", thongTinHoaDons, false);
            if (!flag) {
                System.out.println(" hình như không có id hóa đơn bạn muốm tìm ");
            }
        }
    }
}
