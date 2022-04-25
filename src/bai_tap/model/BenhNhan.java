package bai_tap.model;

import bai_tap.services.IToString;

public class BenhNhan implements IToString {

    private int soThuTu;
    private String maBenAn;
    private String maBenNhan;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;

    public BenhNhan(int soThuTu, String maBenAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenAn = maBenAn;
        this.maBenNhan = maBenNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public BenhNhan() {
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenAn() {
        return maBenAn;
    }

    public void setMaBenAn(String maBenAn) {
        this.maBenAn = maBenAn;
    }

    public String getMaBenNhan() {
        return maBenNhan;
    }

    public void setMaBenNhan(String maBenNhan) {
        this.maBenNhan = maBenNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "" +
                "soThuTu=" + soThuTu +
                ", maBenAn=" + maBenAn +
                ", maBenNhan=" + maBenNhan +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'';
    }

    @Override
    public String toStringCSV() {
        return soThuTu + "," + maBenAn + "," + maBenNhan + "," + tenBenhNhan + "," + ngayNhapVien + "," + ngayRaVien + "," + lyDoNhapVien;
    }
}
