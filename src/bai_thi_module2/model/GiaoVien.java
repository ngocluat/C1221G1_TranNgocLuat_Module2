package bai_thi_module2.model;

import bai_thi_module2.services.IToStringToCSV;

public class GiaoVien extends LopHoc implements IToStringToCSV {
    private String maGiaoVien;
    private  String tenGiaoVien;
    private  String ngaySinh;
    private String gioiTinh;
    private  String soDienThoai;


    public GiaoVien() {
    }

    public GiaoVien(int maLopHoc, String tenLopHoc, String maGiaoVien, String maGiaoVien1, String tenGiaoVien, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(maLopHoc, tenLopHoc, maGiaoVien);
        this.maGiaoVien = maGiaoVien1;
        this.tenGiaoVien = tenGiaoVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public GiaoVien(String maGiaoVien, String tenGiaoVien, String ngaySinh, String gioiTinh, String soDienThoai) {
        this.maGiaoVien = maGiaoVien;
        this.tenGiaoVien = tenGiaoVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    @Override
    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    public void setTenGiaoVien(String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
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

    @Override
    public String toString() {
        return "GiaoVien{" +
                "maGiaoVien='" + maGiaoVien + '\'' +
                ", tenGiaoVien='" + tenGiaoVien + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", maGiaoVien='" + maGiaoVien + '\'' +
                '}';
    }


    @Override
    public String writeFileCSV() {
        return super.writeFileCSV() + maGiaoVien + "," + tenGiaoVien + "," + ngaySinh + "," + gioiTinh + "," + soDienThoai + "," + maGiaoVien;
    }
}
