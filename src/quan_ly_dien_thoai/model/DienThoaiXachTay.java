package quan_ly_dien_thoai.model;

public class DienThoaiXachTay extends DienThoai {
    private String quocGia;
    private String trangThai;

    public DienThoaiXachTay(int id, String tenDienThoai, double giaBan, long soLuong, String nhaSanXuat, String quocGia, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay(String quocGia, String trangThai) {
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay() {
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" +
                super.toString() +
                "quocGia='" + quocGia + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }

    @Override
    public String toStringFile() {
        return super.toStringFile() + "," + quocGia + "," + trangThai;
    }
}
