package ss6_ke_thua.bai_tap.LopCircleVaLopCylinder;

public class Circlee {
    //bán kính, màu sắc
    int banKinh;
    String mauSat;

    public Circlee() {

    }

    public Circlee(int banKinh, String mauSat) {
        this.banKinh = banKinh;
        this.mauSat = mauSat;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSat() {
        return mauSat;
    }

    public void setMauSat(String mauSat) {
        this.mauSat = mauSat;
    }

    public double dienTich() {
        double dienTich = Math.pow(banKinh, 2) * 3.14;
        return dienTich;
    }

}
