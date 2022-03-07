package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Villa;
import case_study_module2.services.IFacilityService;
import case_study_module2.services.Ifacility;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class FacilityServiceImpl implements IFacilityService, Ifacility {

    static LinkedHashMap<String, Integer> villaLinked = new LinkedHashMap<>();
    static LinkedHashMap<String, Integer> roomLinked = new LinkedHashMap<>();
    static LinkedHashMap<String, Integer> houseLinked = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
//    static Villa villa1 = new Villa(" alibaba ", 80.2, 505520, 9, "ngắn ", " tốt ", 214, 11);
//    static Villa villa2 = new Villa(" edison ", 80.2, 100200, 10, " thuê dài lâu", " tốt ", 234, 10);
//    static Room room1 = new Room("mana", 2420, 4562700, 10, "dài hạn", "At 1 month free ");
//    static Room room2 = new Room("mana", 111, 99929, 20, "ngắn hạn", "At 5 day free ");
//    static House house1 = new House("alibaba", 345, 45267, 9, "thuê dài hạn ", " tốt", 2);
//    static House house2 = new House("alibaba", 222, 897987, 6, "thuê ngắn hạn ", " tốt", 2);

    static {
        Villa villa1 = new Villa(" alibaba ", 80.2, 505520, 9, "ngắn ", " tốt ", 214, 11);
        Villa villa2 = new Villa(" edison ", 80.2, 100200, 10, " thuê dài lâu", " tốt ", 234, 10);
        Room room1 = new Room("mana", 2420, 4562700, 10, "dài hạn", "At 1 month free ");
        Room room2 = new Room("lana", 111, 99929, 20, "ngắn hạn", "At 5 day free ");
        House house1 = new House("alibahai", 345, 45267, 9, "thuê dài hạn ", " tốt", 2);
        House house2 = new House("alibaba", 222, 897987, 6, "thuê ngắn hạn ", " tốt", 2);
        villaLinked.put(villa1.getTenDichVu(), 0);
        villaLinked.put(villa2.getTenDichVu(), 0);
        roomLinked.put(room1.getTenDichVu(), 0);
        roomLinked.put(room2.getTenDichVu(), 0);
        houseLinked.put(house1.getTenDichVu(), 0);
        houseLinked.put(house2.getTenDichVu(), 0);
    }

    @Override
    public void displayListmaintenance() {


    }

    @Override
    public void add() {
    }

    public void addVilla() {
        System.out.println(" nhập tên dịch vụ");
        String tenDichVu = scanner.nextLine();
        System.out.println(" nhập diện tích sữ dụng");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập chi phí thuê ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập số lượn người tối đa");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println(" kiểu thuê ");
        String kieuThue = scanner.nextLine();
        System.out.println(" tiêu chẩn phòng");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("diện tích hồ bơi");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println(" số tầng");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        villaLinked.put(villa.getTenDichVu(), 0);
    }

    public void addRoom() {
        System.out.println(" nhập tên dịch vụ");
        String tenDichVu = scanner.nextLine();
        System.out.println(" nhập diện tích sữ dụng");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập chi phí thuê ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập số lượn người tối đa");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println(" kiểu thuê ");
        String kieuThue = scanner.nextLine();
        System.out.println(" tiêu dụ miễn phí đi kèm ");
        String free = scanner.nextLine();

        Room room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, free);
        roomLinked.put(room.getTenDichVu(), 0);
    }

    public void addHouse() {
        System.out.println(" nhập tên dịch vụ");
        String tenDichVu = scanner.nextLine();
        System.out.println(" nhập diện tích sữ dụng");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập chi phí thuê ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập số lượn người tối đa");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println(" kiểu thuê ");
        String kieuThue = scanner.nextLine();
        System.out.println(" nhập tiêu chuẩn phòng");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println(" nhập số tầng ");
        int soTang = Integer.parseInt(scanner.nextLine());

        House house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        houseLinked.put(house.getTenDichVu(), 0);
    }

    @Override
    public void display() {
        System.out.println(villaLinked.entrySet());
        System.out.println(roomLinked.entrySet());
        System.out.println(houseLinked.entrySet());
    }
}
