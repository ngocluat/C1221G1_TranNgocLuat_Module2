package bai_tap_lam_them_ngay12_3_22.model;

public class OTo extends Car {
    int seat;
    String carType;


    public OTo() {
    }

    public OTo(String licensePlate, String producer, int yearOfManufacture, String owner, int seat, String carType) {
        super(licensePlate, producer, yearOfManufacture, owner);
        this.seat = seat;
        this.carType = carType;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Oto{" +
                ", licensePlate='" + licensePlate + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                ", seat=" + seat +
                ", carType='" + carType + '\'' +
                '}';
    }
    public  String toStringOTo(){
        return this.licensePlate+","+this.producer+","+this.yearOfManufacture+","+this.owner+","+this.seat+","+this.carType;
    }
}

