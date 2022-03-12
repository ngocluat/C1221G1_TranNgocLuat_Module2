package bai_tap_lam_them_ngay12_3_22.model;

public class Vans extends Car {
   long tonnage;

    public Vans() {

    }

    public Vans(String licensePlate, String producer, int yearOfManufacture, String owner, long tonnage) {
        super(licensePlate, producer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public long getTonnage() {
        return tonnage;
    }

    public void setTonnage(long tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Vans{" +

                ", licensePlate='" + licensePlate + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                "tonnage=" + tonnage +
                '}';
    }
    public   String toStringVans(){
        return this.licensePlate+","+this.producer+","+this.yearOfManufacture+","+this.owner+","+this.tonnage;
    }
}
