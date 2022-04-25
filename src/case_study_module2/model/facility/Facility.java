package case_study_module2.model.facility;


import case_study_module2.services.IToStringCSV;

import java.util.Objects;

public  class Facility implements IToStringCSV {
    String maDichVu;
    private String tenDichVu;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoiToiDa;
    private String kieuThue;


    public Facility() {
    }

    public Facility(String maDichVu,String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
        this.maDichVu= maDichVu;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "maDichVu='" + maDichVu + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + String.format("%.0f", dienTichSuDung) +
                ", chiPhiThue=" + String.format("%.0f", chiPhiThue) +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public String toStringFacility() {
        return this.getMaDichVu() + "," + this.getTenDichVu() + "," + this.getDienTichSuDung() + "," + this.getChiPhiThue() + "," + this.getSoLuongNguoiToiDa() + "," + this.getKieuThue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return getMaDichVu().equals(facility.getMaDichVu());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaDichVu());
    }

    @Override
    public String fileCSV() {
        return this.getMaDichVu() + "," + this.getTenDichVu() + "," + this.getDienTichSuDung() + "," + this.getChiPhiThue() + "," + this.getSoLuongNguoiToiDa() + "," + this.getKieuThue();
    }
}
