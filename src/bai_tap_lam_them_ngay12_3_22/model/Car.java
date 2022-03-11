package bai_tap_lam_them_ngay12_3_22.model;

public  abstract class Car {
    //tin: Biển kiểm soát , tên hãng sản xuất, năm sản xuất, chủ sở hữu.
    String licensePlate;
    String producer;
    int yearOfManufacture;
    String owner;

    public Car() {
    }

    public Car(String licensePlate, String producer, int yearOfManufacture, String owner) {
        this.licensePlate = licensePlate;
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}
