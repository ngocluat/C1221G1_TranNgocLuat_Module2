package test_example.bai_tap_lam_thu.model;

public class Product {
    int id;
    String tenSanPham;

    public Product() {
    }

    public Product(int id, String teenSanPhem) {
        this.id = id;
        this.tenSanPham = teenSanPhem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String toStringProduct() {
        return this.id + "," + this.tenSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", teenSanPhem='" + tenSanPham + '\'' +
                '}';
    }

}
