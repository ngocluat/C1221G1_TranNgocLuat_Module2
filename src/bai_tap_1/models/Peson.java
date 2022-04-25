package bai_tap_1.models;

public abstract class Peson {
    private int customerID;
    private String nameCostomer;

    public Peson(int customerID, String nameCostomer) {
        this.customerID = customerID;
        this.nameCostomer = nameCostomer;
    }

    public Peson() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getNameCostomer() {
        return nameCostomer;
    }

    public void setNameCostomer(String nameCostomer) {
        this.nameCostomer = nameCostomer;
    }

    @Override
    public String toString() {
        return "Peson{" +
                "customerID=" + customerID +
                ", nameCostomer='" + nameCostomer + '\'' +
                '}';
    }
}
