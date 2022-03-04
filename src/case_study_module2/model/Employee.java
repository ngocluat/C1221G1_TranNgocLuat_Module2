package case_study_module2.model;

public class Employee extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private Long luong;

    public Employee() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Long getLuong() {
        return luong;
    }

    public void setLuong(Long luong) {
        this.luong = luong;
    }

    public Employee(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String eMail, String maNhanVien, String trinhDo, String viTri, Long luong) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, eMail);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;

    }

    @Override
    public String toString() {
        return "EmployeeServiceImpl{" +
                "maNhanVien='" + maNhanVien + '\'' +
                super.toString()+
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
