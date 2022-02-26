package bai_tap_lam_themOOP1.Bai2;

import java.util.Scanner;

public class NganHangABC {
    long soTaiKhoan;
    String tenTaiKhoan;
    double soTienTrongTaiKhoan;
    final double LAIXUAT = 0.035;


    public NganHangABC() {

    }

    public NganHangABC(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public NganHangABC(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "NganHangABC{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan + " nghìn đồng   " +
                '}';
    }

    public void napTien(double soTienThem) {
        if (soTienThem > 0) {
            setSoTienTrongTaiKhoan(getSoTienTrongTaiKhoan() + soTienThem);
        }
    }

    public void rutTien(double soTienMuonRut) {
        if (soTienMuonRut > 0) {
            setSoTienTrongTaiKhoan(getSoTienTrongTaiKhoan() - soTienMuonRut);
        } else {
            System.out.println("tiền hk có mà bày đặt thêm");
        }
    }

    public void daoHan() {
        setSoTienTrongTaiKhoan(getSoTienTrongTaiKhoan() + (getSoTienTrongTaiKhoan() * LAIXUAT));
    }

    public void chuyenTien(double soTienMuonChuyen, NganHangABC tenNganhangNHan) {
        Scanner scanner = new Scanner(System.in);
        setSoTienTrongTaiKhoan( getSoTienTrongTaiKhoan() -soTienMuonChuyen );
//        tenNganhangNHan + soTienMuonChuyen;

    }

}
