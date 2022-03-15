package test_example.vi_du_nho.test_bai_tap.model;

public class Product1 {
    int id;
    String moTa;

    public Product1() {
    }

    public Product1(int id, String moTa) {
        this.id = id;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "id=" + id +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
