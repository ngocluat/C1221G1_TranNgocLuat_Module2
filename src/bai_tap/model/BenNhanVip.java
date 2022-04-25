package bai_tap.model;

public class BenNhanVip extends BenhNhan {
    String loaiVip;
    String thoiHanVip;

    public BenNhanVip(int soThuTu, String maBenAn, String maBenNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(soThuTu, maBenAn, maBenNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public BenNhanVip() {

    }

    public BenNhanVip(int soThuTuBenhAn, String maBenAn, int maBenNhan, String tenBenNhan, String ngayNhapVien, String ngayRaVien, String lyDo, String loaiVIP, String thoiHanVip) {
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenNhanVip{" +
                super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }

    @Override
    public String toStringCSV() {
        return super.toStringCSV()+ "," + loaiVip + "," + thoiHanVip;
    }
}
