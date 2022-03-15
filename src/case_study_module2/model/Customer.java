package case_study_module2.model;

public class Customer extends Person {
    private String maKhachHang;
    private String loaiKhachHang;
    private String diaChi;

    public Customer() {
    }

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String eMail, String maKhachHang, String loaiKhachHang, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, eMail);
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang='" + maKhachHang + '\'' +
                super.toString() +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public String toStringPeson() {
        return super.toStringPeson() + "," + this.getMaKhachHang() + "," + this.getLoaiKhachHang() + "," + this.getDiaChi();
    }
}