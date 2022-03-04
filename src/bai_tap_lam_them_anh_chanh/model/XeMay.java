package bai_tap_lam_them_anh_chanh.model;

import bai_tap_lam_them_anh_chanh.model.PhuongTien;

public class XeMay extends PhuongTien {
    int congXuat;

    public XeMay() {
    }

    public XeMay(int congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congXuat=" + congXuat +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
