package bai_tap.services;

import bai_tap.model.BenNhanVip;
import bai_tap.model.BenhNhan;
import bai_tap.model.BenhNhanThuong;
import bai_tap.util.DocGhiFile;
import bai_tap.util.RegexInput;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import static bai_tap.util.RegexInput.simpleDateFormat;

public class ChucNang implements IChucNang, IThemBenNhan {
    static Scanner scanner = new Scanner(System.in);
    static List<BenhNhan> benhNhans = null;
    private static final String NAME_FILE = "src\\bai_tap\\data\\benNhan.csv";

    static {
        benhNhans = DocGhiFile.readCostomerVNList1();
    }

    int soThuTuBenhAn;
    String maBenhAn;
    String maBenNhan;
    String tenBenNhan;
    String ngayNhapVien;
    String ngayRaVien;
    String lyDo;

    @Override
    public void xoa() {
        System.out.println("nhập id cần xóa ");
        int idXoa = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < benhNhans.size(); i++) {
            if (benhNhans.get(i).getSoThuTu() == idXoa) {
                System.out.println("banjn có muốn chắn chắn xóa hay không Y/ N??");
                String chon = scanner.nextLine();
                if ("y".equals(chon.toLowerCase())) {
                    benhNhans.remove(benhNhans.get(i));
                    System.out.println(" đã xóa thành công ");
                    hienThi();
                } else {
                    System.out.println(" không xóa ");
                }

                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("khonog có id bạn muốn xóa ");
        }
    }

    @Override
    public void hienThi() {
        try {
            methodCheck();
        } catch (NotFoundMedicalRecordException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void themBenNhanThuong() {
        chung();
        System.out.print("phí nhập viện ");
        double phiNhapVien = Double.parseDouble(scanner.nextLine());
        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(soThuTuBenhAn, maBenhAn, maBenNhan, tenBenNhan, ngayNhapVien, ngayRaVien, lyDo, phiNhapVien);
        benhNhans.add(benhNhanThuong);
        DocGhiFile.writeListString(NAME_FILE, benhNhans, false);
        System.out.println(" đã thêm bệnh nhân thường ");
    }

    @Override
    public void themBenNhanVip() {
        chung();
        String loaiVIP = null;
        do {
            System.out.print("loại VIP\n I .Loại I , II .Loại II, III .Loại III");
            loaiVIP = scanner.nextLine();
            if (loaiVIP.equals("I") || loaiVIP.equals("II") || loaiVIP.equals("III")) {
                break;
            } else {
                System.out.println(" chỉ có 3 loại thôi !!");
            }
        } while (true);

        System.out.print("thời hạn VIP");
        String thoiHanVip = scanner.nextLine();
        BenNhanVip benNhanVip = new BenNhanVip(soThuTuBenhAn, maBenhAn, maBenNhan, tenBenNhan, ngayNhapVien, ngayRaVien, lyDo, loaiVIP, thoiHanVip);
        benhNhans.add(benNhanVip);
        DocGhiFile.writeListString(NAME_FILE, benhNhans, false);
        System.out.println(" đã thêm bệnh nhân vip ");

    }

    public void chung() {
        if (benhNhans.size() == 0) {
            soThuTuBenhAn = 1;
        } else {
            soThuTuBenhAn = (benhNhans.get(benhNhans.size() - 1).getSoThuTu()) + 1;
        }
        maBenhAn = QuanLyChucNang.maBenhAn();
        maBenNhan = QuanLyChucNang.maBenhNhan();
        tenBenNhan = QuanLyChucNang.ten();
        ngayNhapVien = QuanLyChucNang.ngayNhapVien();
        do {
            System.out.print("Ngày ra viện");
            ngayRaVien = scanner.nextLine();
            if (RegexInput.regexNgaySinh(ngayRaVien)) {
                while (true) {
                    try {
                        if (simpleDateFormat.parse(ngayNhapVien).compareTo(simpleDateFormat.parse(ngayRaVien))<=0){
                            break;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    System.out.println("ngày ra viện phải lớn hơn ngày xuất viên ");
                    ngayRaVien = scanner.nextLine();
                }
                break;
            } else {
                System.out.println(" nhập sai định dạnh  ");
            }

        } while (true);

        System.out.print("Lý do nhập viện");
        lyDo = scanner.nextLine();
    }

    public void methodCheck() throws NotFoundMedicalRecordException {
        if (benhNhans.size() > 0) {
            for (BenhNhan item : benhNhans) {
                System.out.println(item);
            }
        } else {
            throw new NotFoundMedicalRecordException(" không tìm thấy ");
        }
    }

}
