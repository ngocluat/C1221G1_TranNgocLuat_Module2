package case_study_module2.model;

public abstract class Person {
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String eMail;

    public Person() {
    }

    public Person(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String eMail) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.eMail = eMail;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
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

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", eMail='" + eMail + '\''
              ;
    }
    public String toStringPeson(){
        return  this.getHoVaTen()+","+ this.getNgaySinh()+","+ this.getGioiTinh()+","+this.soCMND+","+this.geteMail();
    }
}
