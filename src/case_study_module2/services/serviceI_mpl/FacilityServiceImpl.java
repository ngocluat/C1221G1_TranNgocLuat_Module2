package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Villa;
import case_study_module2.services.IFacilityService;
import case_study_module2.services.Ifacility;
import case_study_module2.utils.read_and_write_file.regular_expression.CheckInputName;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class FacilityServiceImpl implements IFacilityService, Ifacility {

    static LinkedHashMap<String, Integer> villaLinked = new LinkedHashMap<>();
    static LinkedHashMap<String, Integer> roomLinked = new LinkedHashMap<>();
    static LinkedHashMap<String, Integer> houseLinked = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    String tenDichVu = null;
    double dienTichSuDung = 0;
    double chiPhiThue = 0;
    int soNguoiToiDa = 0;
    String kieuThue = null;


    @Override
    public void displayListmaintenance() {


    }

    @Override
    public void add() {
    }


    @Override
    public void display() {

    }

    public void addVilla() {
        generalMethod();
        String tieuChuanPhong = null;
        do {
            System.out.println(" nhập tiêu chuẩn phòng");
            tieuChuanPhong = scanner.nextLine();
        } while (!CheckInputName.regexNameServiice(tieuChuanPhong));
        System.out.println("diện tích hồ bơi");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println(" số tầng");
        int soTang = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        villaLinked.put(villa.getTenDichVu(), 0);

    }

    public void addRoom() {
        generalMethod();
        System.out.println(" tiêu dụ miễn phí đi kèm ");
        String free = scanner.nextLine();

        Room room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, free);
        roomLinked.put(room.getTenDichVu(), 0);
    }

    public void addHouse() {
        generalMethod();
        String tieuChuanPhong = null;
        do {
            System.out.println(" nhập tiêu chuẩn phòng");
            tieuChuanPhong = scanner.nextLine();
        } while (!CheckInputName.regexNameServiice(tieuChuanPhong));
        int soTang = 0;
        do {
            System.out.println(" nhập số tầng ");
            soTang = Integer.parseInt(scanner.nextLine());
        } while (soTang < 0);

        House house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        houseLinked.put(house.getTenDichVu(), 0);
    }


    public void generalMethod() {
        do {
            System.out.println(" nhập tên dịch vụ");
            tenDichVu = scanner.nextLine();
        } while (!CheckInputName.regexNameServiice(tenDichVu));
        do {
            System.out.println(" nhập diện tích sữ dụng");
            dienTichSuDung = Double.parseDouble(scanner.nextLine());
        } while (dienTichSuDung < 30);
        do {
            System.out.println(" nhập chi phí thuê ");
            chiPhiThue = Double.parseDouble(scanner.nextLine());
        } while (chiPhiThue < 0);
        do {
            System.out.println(" nhập số lượn người tối đa");
            soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        } while (soNguoiToiDa < 0 || soNguoiToiDa > 20);
        do {
            System.out.println(" kiểu thuê ");
            kieuThue = scanner.nextLine();
        } while (!CheckInputName.regexNameServiice(kieuThue));
    }


}
