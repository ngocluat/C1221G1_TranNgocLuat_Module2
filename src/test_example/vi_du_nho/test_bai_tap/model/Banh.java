package test_example.vi_du_nho.test_bai_tap.model;

import test_example.vi_du_nho.test_bai_tap.model.Product1;

public class Banh extends Product1 {
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Banh{" +
                "price=" + price +
                ", id=" + id +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
