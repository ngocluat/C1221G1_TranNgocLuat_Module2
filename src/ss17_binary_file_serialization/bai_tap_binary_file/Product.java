package ss17_binary_file_serialization.bai_tap_binary_file;

import java.io.Serializable;

public class Product implements Serializable {
    private String iD;
    private String hangSangXuat;
    private String producerName;
    private double price;
    private String description;

    public Product() {
    }

    public Product(String iD, String productName, String producerName, double price, String description) {
        this.iD = iD;
        this.hangSangXuat = productName;
        this.producerName = producerName;
        this.price = price;
        this.description = description;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getHangSangXuat() {
        return hangSangXuat;
    }

    public void setHangSangXuat(String hangSangXuat) {
        this.hangSangXuat = hangSangXuat;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return iD +
                ", " + hangSangXuat +
                ", " + producerName +
                ", " + price +
                ", " + description;
    }

}
