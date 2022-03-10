package ss17_binary_file_serialization.bai_tap.model;

public class Product {
    private int iD;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;
    String cacMoTa;

    public Product() {
    }

    public Product(int iD, String tenSanPham, String hangSanXuat, double gia, String cacMoTa) {
        this.iD = iD;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.cacMoTa = cacMoTa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCacMoTa() {
        return cacMoTa;
    }

    public void setCacMoTa(String cacMoTa) {
        this.cacMoTa = cacMoTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD=" + iD +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", cacMoTa='" + cacMoTa + '\'' +
                '}';
    }

    public String toStringProduct() {
        return this.iD + "," + this.tenSanPham + "," + this.hangSanXuat + "," + this.gia + "," + this.cacMoTa;
    }
}

