package bai_tap.model;

public class BenhNhanThuong extends BenhNhan{
    double phiNamVien;

    public BenhNhanThuong(int soThuTu, String maBenAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(soThuTu, maBenAn, maBenNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public BenhNhanThuong() {
    }



    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                super.toString()+
                "phiNamVien=" + String.format("%.0f",phiNamVien) +
                '}';
    }

    @Override
    public String toStringCSV() {
        return super.toStringCSV()+","+phiNamVien;
    }
}
