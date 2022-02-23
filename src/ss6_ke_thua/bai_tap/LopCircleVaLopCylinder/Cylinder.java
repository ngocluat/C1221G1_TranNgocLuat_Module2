package ss6_ke_thua.bai_tap.LopCircleVaLopCylinder;

public class Cylinder extends Circlee {
    int chieuCao;

    public Cylinder() {

    }

    public Cylinder(int chieuCao, int banKinh, String mauSat) {
        super(banKinh, mauSat);
        this.chieuCao = chieuCao;
    }

    public double theTich() {
        return Math.PI * Math.pow(banKinh, 2) * chieuCao;

    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                ", banKinh=" + banKinh +
                ", mauSat='" + mauSat + '\'' +
                '}';
    }
}
