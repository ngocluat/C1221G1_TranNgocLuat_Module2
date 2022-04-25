package bai_tap_1.models;

import bai_tap_1.service.IFileCSV;

public class CostomerVN extends Peson implements IFileCSV {
    private String costomerType;
    private double consumptionNorms;

    public CostomerVN(int customerID, String nameCostomer, String costomerType, double consumptionNorms) {
        super(customerID, nameCostomer);
        this.costomerType = costomerType;
        this.consumptionNorms = consumptionNorms;
    }

    public CostomerVN() {

    }

    public String getCostomerType() {
        return costomerType;
    }

    public void setCostomerType(String costomerType) {
        this.costomerType = costomerType;
    }

    public double getConsumptionNorms() {
        return consumptionNorms;
    }

    public void setConsumptionNorms(double consumptionNorms) {
        this.consumptionNorms = consumptionNorms;
    }

    @Override
    public String toString() {
        return "CostomerVN{" +
                super.toString() +
                "costomerType='" + costomerType + '\'' +
                ", consumptionNorms=" + String.format("%.0f",consumptionNorms);

    }

    @Override
    public String writeFile() {
        return this.getCustomerID() + "," + this.getNameCostomer() + "," + this.getCostomerType() + "," + this.getConsumptionNorms();
    }
}
