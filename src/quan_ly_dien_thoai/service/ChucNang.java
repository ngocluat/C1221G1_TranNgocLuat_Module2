package quan_ly_dien_thoai.service;

import quan_ly_dien_thoai.model.DienThoai;
import quan_ly_dien_thoai.model.DienThoaiChinhHang;
import quan_ly_dien_thoai.model.DienThoaiXachTay;
import quan_ly_dien_thoai.util.DocGhiiiiiiiiiiiiiii;

import java.util.List;
import java.util.Scanner;

public class ChucNang implements IChucNang, IThem {
    private final String NAME_FILE_XACH_TAY = "src\\quan_ly_dien_thoai\\data\\dienThoaiXachTay.csv";
    private final String NAME_FILE_CHINH_HANG = "src\\quan_ly_dien_thoai\\data\\dienThoaiChinhHang.csv";

    static Scanner scanner = new Scanner(System.in);
    static List<DienThoai> dienThoaiXachTays = null;

    static {
        dienThoaiXachTays = DocGhiiiiiiiiiiiiiii.readListDienThoaiChinhHang();
    }

    @Override
    public void xoa() {
        System.out.println(" nhập id bạn muốn xóa ");
        int idtim = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < dienThoaiXachTays.size(); i++) {
            if (dienThoaiXachTays.get(i).getId() == idtim) {
                System.out.println("banjn có muốn chắn chắn xóa hay không Y/ N??");
                String chon = scanner.nextLine();
                if ("y".equals(chon.toLowerCase())) {
                    dienThoaiXachTays.remove(dienThoaiXachTays.get(i));
                    System.out.println(" đã xóa thành công ");
                } else {
                    System.out.println(" không xóa ");
                }
                break;
            }
        }
    }

    @Override
    public void hienThhi() {
        if (dienThoaiXachTays.size() == 0) {
            System.out.println(" không có điện thoại ở trong file ");
        } else {
            for (DienThoai item : dienThoaiXachTays) {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public void tim() {
        System.out.println(" nhập id bạn muốn tìm ");
        int idtim = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < dienThoaiXachTays.size(); i++) {
            if (dienThoaiXachTays.get(i).getId() == idtim) {
                System.out.println(dienThoaiXachTays.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(" không tìm thấy điện thoại bạn muốn tìn ");
        }

    }

    @Override
    public void themDienThoaiChinhHang() {
        int soThuTuBenhAn;
        if (dienThoaiXachTays.size() == 0) {
            soThuTuBenhAn = 1;
        } else {
            soThuTuBenhAn = (dienThoaiXachTays.get(dienThoaiXachTays.size() - 1).getId()) + 1;
        }
        System.out.println(" nhập tên điện thoại ");
        String tenCuaDienThoai = scanner.nextLine();
        System.out.println(" giá bán của điện thoại ");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("số lượng của điện thoại");
        long soLuong = Long.parseLong(scanner.nextLine());
        System.out.println(" nhà sản xuất ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println(" thời gian bảo hành");
        int thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.println(" phamj vi bảo hành");
        String phamViBaoHanh = scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(soThuTuBenhAn, tenCuaDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
        dienThoaiXachTays.add(dienThoaiChinhHang);
        DocGhiiiiiiiiiiiiiii.writeListString("src\\quan_ly_dien_thoai\\data\\dienThoaiChinhHang.csv", dienThoaiXachTays, false);
    }

    @Override
    public void themDienThoaiXachTay() {
        int soThuTuBenhAn;
        if (dienThoaiXachTays.size() == 0) {
            soThuTuBenhAn = 1;
        } else {
            soThuTuBenhAn = (dienThoaiXachTays.get(dienThoaiXachTays.size() - 1).getId()) + 1;
        }
        System.out.println(" nhập tên điện thoại ");
        String tenCuaDienThoai = scanner.nextLine();
        System.out.println(" giá bán của điện thoại ");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("số lượng của điện thoại");
        long soLuong = Long.parseLong(scanner.nextLine());
        System.out.println(" nhà sản xuất ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println(" quốc gia ");
        String quocGia = scanner.nextLine();
        String trangThai = null;
        do {
            System.out.println(" trạng thái \n " +
                    "1. đã sửa chữa\n" +
                    "2. chưa sử chữa ");
            trangThai = scanner.nextLine();
            if (trangThai.equals("1")||trangThai.equals("2")){
                break;
            }else {
                System.out.println(" nhập sai ");
            }
        } while (true);

        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(soThuTuBenhAn, tenCuaDienThoai, giaBan, soLuong, nhaSanXuat, quocGia, trangThai);
        dienThoaiXachTays.add(dienThoaiXachTay);
        DocGhiiiiiiiiiiiiiii.writeListString("src\\quan_ly_dien_thoai\\data\\dienThoaiChinhHang.csv", dienThoaiXachTays, false);
    }
}
