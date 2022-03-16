package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Facility;
import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Villa;
import case_study_module2.services.IFacility;
import case_study_module2.services.IFacilityDisplayMaintenance;
import case_study_module2.utils.read_and_write_file.ReadAndWriteFacility;
import case_study_module2.utils.read_and_write_file.regular_expression.CheckInputName;
import case_study_module2.utils.read_and_write_file.regular_expression.CheckInputServiceCode;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FacilityServiceImpl implements IFacilityDisplayMaintenance, IFacility {

    static Map<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
    static List<Villa> villaList = null;
    static List<Room> roomList = null;
    static List<House> houseList = null;

    static {
        villaList = ReadAndWriteFacility.readVillaList();
        roomList = ReadAndWriteFacility.readRoomList();
        houseList = ReadAndWriteFacility.readHouseList();
    }

    static Scanner scanner = new Scanner(System.in);
    String tenDichVu = null;
    double dienTichSuDung = 0;
    double chiPhiThue = 0;
    int soNguoiToiDa = 0;
    String kieuThue = null;

    @Override
    public void displayListmaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerLinkedHashMap.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey());
            }
        }
    }
    @Override
    public void display() {
        System.out.println("++++++✞ঔৣVĨĹĹÁ ♚+++++++");
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
        System.out.println("=======๖ۣۜҨž乡ⓇⓄⓄⓂ=========");
        for (Room room : roomList
        ) {
            System.out.println(room);
        }
        System.out.println("+=========๖²⁴ʱᕼOᑌᔕE ︵❣======");
        for (House house : houseList) {
            System.out.println(house);
        }
    }

    public void addVilla() {
        String maDichVu = null;
        do {
            System.out.println(" nhập mã dịch vụ ");
            maDichVu = scanner.nextLine();
        } while (!CheckInputServiceCode.regexMaDichVuVilla(maDichVu));
        generalMethod();
        String tieuChuanPhong = null;
        do {
            System.out.println(" nhập tiêu chuẩn phòng lớn hơn 30m2");
            tieuChuanPhong = scanner.nextLine();
        } while (!CheckInputName.regexName(tieuChuanPhong));
        double dienTichHoBoi = 0;
        do {
            System.out.println("diện tích hồ bơi lớn hơn 30m2");
            dienTichHoBoi = Double.parseDouble(scanner.nextLine());

        } while (dienTichHoBoi < 30);
        int soTang = 0;
        do {
            System.out.println(" nhập số tầng ");
            soTang = Integer.parseInt(scanner.nextLine());
        } while (soTang < 0);

        Villa villa = new Villa(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        villaList.add(villa);
        ReadAndWriteFacility.writeListVilla(villaList, true);

    }

    public void addRoom() {
        String maDichVu = null;
        do {
            System.out.println(" nhập mã dịch vụ ");
            maDichVu = scanner.nextLine();
        } while (!CheckInputServiceCode.regexMaDichVuRoom(maDichVu));
        generalMethod();
        System.out.println(" tiêu dụ miễn phí đi kèm ");
        String free = scanner.nextLine();

        Room room = new Room(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, free);
        roomList.add(room);
        ReadAndWriteFacility.writeListRoom(roomList, true);

    }

    public void addHouse() {
        String maDichVu = null;
        do {
            System.out.println(" nhập mã dịch vụ ");
            maDichVu = scanner.nextLine();
        } while (!CheckInputServiceCode.regexMaDichVuHouse(maDichVu));
        generalMethod();

        String tieuChuanPhong = null;
        do {
            System.out.println(" nhập tiêu chuẩn phòng");
            tieuChuanPhong = scanner.nextLine();
        } while (!CheckInputName.regexName(tieuChuanPhong));
        int soTang = 0;
        do {
            System.out.println(" nhập số tầng ");
            soTang = Integer.parseInt(scanner.nextLine());
        } while (soTang < 0);

        House house = new House(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        houseList.add(house);
        ReadAndWriteFacility.writeListHouse(houseList, true);
    }

    public void generalMethod() {
        do {
            System.out.println(" nhập tên dịch vụ");
            tenDichVu = scanner.nextLine();
        } while (!CheckInputName.regexName(tenDichVu));
        do {
            System.out.println(" nhập diện tích sữ dụng");
            dienTichSuDung = Double.parseDouble(scanner.nextLine());
        } while (dienTichSuDung < 30);
        do {
            System.out.println(" nhập chi phí thuê ");
            chiPhiThue = Double.parseDouble(scanner.nextLine());
        } while (chiPhiThue < 0);
        do {
            System.out.println(" nhập số lượn người tối đa!!lượng người tối đa phải >0 và nhỏ hơn <20     ");
            soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        } while (soNguoiToiDa < 0 || soNguoiToiDa > 20);
        do {
            System.out.println(" kiểu thuê gồm thuê theo năm\n tháng\nngày\n giờ\n");
            kieuThue = scanner.nextLine();

        } while (!kieuThue.equals("năm") && !kieuThue.equals("tháng") && !kieuThue.equals("ngày") && !kieuThue.equals("giờ"));
    }
}
