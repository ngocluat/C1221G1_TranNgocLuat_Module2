package bai_thi_module2.model;

import bai_thi_module2.services.IToStringToCSV;

public class SinhVien implements IToStringToCSV {
    private int maSinhVien;
    private String tenSinhVien;
    private String ngaySinh;
    private String gioiTinh;
    private String soDienThoai;
    private String maLopHocSinhVien;

    public SinhVien(int maSinhVien, String tenSinhVien, String ngaySinh, String gioiTinh, String soDienThoai, String maLopHocSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.maLopHocSinhVien = maLopHocSinhVien;
    }

    public SinhVien() {

    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaLopHocSinhVien() {
        return maLopHocSinhVien;
    }

    public void setMaLopHocSinhVien(String maLopHocSinhVien) {
        this.maLopHocSinhVien = maLopHocSinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", maLopHocSinhVien='" + maLopHocSinhVien + '\'' +
                '}';
    }


    public String writeFileCSV() {
        return maSinhVien + "," + tenSinhVien + "," + ngaySinh + "," + gioiTinh + "," + soDienThoai + "," + maLopHocSinhVien;
    }
}
