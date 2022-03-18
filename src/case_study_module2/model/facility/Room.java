package case_study_module2.model.facility;


import case_study_module2.services.IToStringCSV;

public class Room extends Facility implements IToStringCSV {
    private String dichVuMienPhiDiKem;

    public Room() {
    }
    public Room(String maDichvu,String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichvu,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }
    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }
    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }
    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                '}';}


    @Override
    public String fileCSV() {
        return super.fileCSV()+","+this.getDichVuMienPhiDiKem();
    }
}
