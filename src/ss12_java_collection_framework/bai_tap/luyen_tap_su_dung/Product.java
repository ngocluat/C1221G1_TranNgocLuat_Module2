package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung;

public class Product {

    private int soLuong;
    private long iDSach;
    private String tenSanPham;
    private double gia;

    public Product() {

    }

    public Product(int soLuong, long iDSach, String tenSanPham, double gia) {
        this.soLuong = soLuong;
        this.iDSach = iDSach;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getiDSach() {
        return iDSach;
    }

    public void setiDSach(long iDSach) {
        this.iDSach = iDSach;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "soLuong=" + soLuong +
                ", iDSach=" + iDSach +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", gia=" + gia +
                "}\n";
    }
}
