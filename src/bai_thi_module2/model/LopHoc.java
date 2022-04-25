package bai_thi_module2.model;

import bai_thi_module2.services.IToStringToCSV;

public abstract class LopHoc implements IToStringToCSV {
    private int maLopHoc;
    private String tenLopHoc;
    private String maGiaoVien;

    public LopHoc(int maLopHoc, String tenLopHoc, String maGiaoVien) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.maGiaoVien = maGiaoVien;
    }

    public LopHoc() {
    }

    public int getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(int maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "maLopHoc=" + maLopHoc +
                ", tenLopHoc='" + tenLopHoc + '\'' +
                ", maGiaoVien='" + maGiaoVien + '\'' +
                '}';
    }

    @Override
    public String writeFileCSV() {
        return maLopHoc +","+tenLopHoc+","+ maGiaoVien;
    }

    /**
     *  public String writeFileCSVlopHoc() {
     *         return maLopHoc +","+tenLopHoc+","+ maGiaoVien;
     *     }
     * @return
     */

}
