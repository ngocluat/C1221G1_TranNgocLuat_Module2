package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Facility;
import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Villa;
import case_study_module2.services.IFacilityService;
import case_study_module2.services.Ifacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class FacilityServiceImpl implements IFacilityService, Ifacility {

    static LinkedHashMap<Facility, Integer> facility = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        facility.put(new Villa(" alibaba ", 80.2, 505520, 9, "ngắn ", " tốt ", 214, 11), 0);
        facility.put(new Villa(" edison ", 80.2, 100200, 10, " thuê dài lâu", " tốt ", 234, 10), 0);
        facility.put(new Room("mana", 2420, 4562700, 10, "dài hạn", "At 1 month free "), 0);
        facility.put(new Room("mana", 111, 99929, 20, "ngắn hạn", "At 5 day free "), 0);
        facility.put(new House("alibaba", 345, 45267, 9, "thuê dài hạn ", " tốt", 2), 0);
        facility.put(new House("alibaba", 222, 897987, 6, "thuê ngắn hạn ", " tốt", 2), 7);
    }

    @Override

    public void displayListmaintenance() {

        for (Map.Entry<Facility, Integer> entry : facility.entrySet()) {
            if (entry.getValue() > 5) {
                System.out.println(entry.getKey());
            }
        }
    }

    @Override
    public void add() {
                  // trưng
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
        facility.put(new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang), 0);
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

        facility.put(new Room(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, free), 0);
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

        facility.put(new House(tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang), 0);

    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> entry : facility.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
