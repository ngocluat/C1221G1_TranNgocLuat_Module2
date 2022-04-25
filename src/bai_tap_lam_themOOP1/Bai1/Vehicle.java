package bai_tap_lam_themOOP1.Bai1;

public class Vehicle {
    private String ten;
    private int tuoi;
    private int giaTriXe;
    private int dungTichXiLanh;

    public Vehicle() {

    }

    public Vehicle(String ten, int tuoi, int giaTriXe, int dungTichXiLanh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.giaTriXe = giaTriXe;
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGiaTriXe() {
        return giaTriXe;
    }

    public void setGiaTriXe(int giaTriXe) {
        this.giaTriXe = giaTriXe;
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        this.dungTichXiLanh = dungTichXiLanh;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", giaTriXe=" + giaTriXe +
                ", dungTichXiLanh=" + dungTichXiLanh +
                '}';
    }

    public void tienThue () {
            if (this.dungTichXiLanh < 100) {
                int thue = this.giaTriXe * 1 / 100 ;
                System.out.println(" thề thuế là " + thue + " đồng ");
            } else if (this.dungTichXiLanh < 200) {
                int thue = this.giaTriXe * 3 / 100;
                System.out.println(" thề thuế là " + thue + "  đồng ");
            } else {
                int thue = this.giaTriXe * 5 / 100;
                System.out.println(" thề thuế là " + thue + "  đồng ");
            }
        }

}
