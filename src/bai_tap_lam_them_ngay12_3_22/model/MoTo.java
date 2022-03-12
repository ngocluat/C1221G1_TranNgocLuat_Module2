package bai_tap_lam_them_ngay12_3_22.model;

public class MoTo extends Car {
    long production;

    public MoTo() {

    }

    public MoTo(String licensePlate, String producer, int yearOfManufacture, String owner, long production) {
        super(licensePlate, producer, yearOfManufacture, owner);
        this.production = production;
    }

    public long getProduction() {
        return production;
    }

    public void setProduction(long production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "MoTo{" +
                ", licensePlate='" + licensePlate + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                "production=" + production +
                '}';
    }

    public String toStringMoTo() {
        return this.licensePlate + "," + this.producer + "," + this.yearOfManufacture + "," + this.owner + "," + this.production;
    }
}
