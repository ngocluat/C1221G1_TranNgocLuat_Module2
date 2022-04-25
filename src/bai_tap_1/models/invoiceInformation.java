package bai_tap_1.models;

public abstract class invoiceInformation {
    //Mã hóa đơn, Mã khách hàng,  ngày ra hoá đơn (ngày, tháng, năm)
    // , số lượng (số KW tiêu thụ), đơn giá, thành tiền
    int iDBill;
    int costomerType;
    String billDay;
    double amountKW;
    double bill;
    long money;

    public invoiceInformation(int iDBill, int costomerType, String billDay, double amountKW, double bill, long money) {
        this.iDBill = iDBill;
        this.costomerType = costomerType;
        this.billDay = billDay;
        this.amountKW = amountKW;
        this.bill = bill;
        this.money = money;
    }

    public invoiceInformation() {
    }

    public int getiDBill() {
        return iDBill;
    }

    public void setiDBill(int iDBill) {
        this.iDBill = iDBill;
    }

    public int getCostomerType() {
        return costomerType;
    }

    public void setCostomerType(int costomerType) {
        this.costomerType = costomerType;
    }

    public String getBillDay() {
        return billDay;
    }

    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }

    public double getAmountKW() {
        return amountKW;
    }

    public void setAmountKW(double amountKW) {
        this.amountKW = amountKW;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "invoiceInformation{" +
                "iDBill=" + iDBill +
                ", costomerType=" + costomerType +
                ", billDay='" + billDay + '\'' +
                ", amountKW=" + amountKW +
                ", bill=" + bill +
                ", money=" + money +
                '}';
    }

}
