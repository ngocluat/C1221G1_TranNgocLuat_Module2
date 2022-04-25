package case_study_module2.model;

import case_study_module2.services.IToStringCSV;

public class Contract implements IToStringCSV {
    private String soHopDong;
    private String maBooking;
    private double soTienCocTruoc;
    private double tongSoTienThanhToan;
    private String maKhachHang;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, double soTienCocTruoc, double tongSoTienThanhToan, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(double soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public double getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(double tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", soTienCocTruoc=" + String.format("%,.0f",soTienCocTruoc) +
                ", tongSoTienThanhToan=" +  String.format("%,.0f",tongSoTienThanhToan) +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }


//    @Override
//    public String write() {
//        return soHopDong + "," + maBooking + "," + soTienCocTruoc + "," + tongSoTienThanhToan + "," + maKhachHang;
//    }

    @Override
    public String fileCSV() {
        return soHopDong + "," + maBooking + "," + soTienCocTruoc + "," + tongSoTienThanhToan + "," + maKhachHang;

    }
}
