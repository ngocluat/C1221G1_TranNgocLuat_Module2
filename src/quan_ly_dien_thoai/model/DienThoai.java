package quan_ly_dien_thoai.model;

import quan_ly_dien_thoai.service.IGhiFile;

public class DienThoai implements IGhiFile {
    //ID, Tên điện thoại, Giá bán, Số lượng, Nhà sản xuất.
    private int id;
    private String tenDienThoai;
    private double giaBan;
    private long soLuong;
    private String nhaSanXuat;

    public DienThoai(int id, String tenDienThoai, double giaBan, long soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public DienThoai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    @Override
    public String toStringFile() {
        return id + "," + tenDienThoai + "," + giaBan + "," + soLuong + "," + nhaSanXuat;
    }
}
