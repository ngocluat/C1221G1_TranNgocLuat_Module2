package bai_tap_1.models;

import bai_tap_1.service.IFileCSV;

public class CostomerNN extends Peson implements IFileCSV {
   private String nationality;

    public CostomerNN(int customerID, String nameCostomer, String nationality) {
        super(customerID, nameCostomer);
        this.nationality = nationality;
    }

    public CostomerNN() {

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "CostomerNN{" + super.toString()+
                ", nationality='" + nationality;

    }

    @Override
    public String writeFile() {
        return this.getCustomerID() + "," + this.getNameCostomer() + "," + this.getNationality();
    }
}
