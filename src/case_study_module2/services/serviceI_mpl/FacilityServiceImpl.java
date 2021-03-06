package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.facility.Facility;
import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;
import case_study_module2.services.IFacility;
import case_study_module2.services.IFacilityService;
import case_study_module2.utils.read_and_write_file.ReadAndWriteFacility;
import case_study_module2.utils.read_and_write_file.WriteFile;
import case_study_module2.utils.read_and_write_file.regular_expression.CheckInput;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FacilityServiceImpl implements IFacilityService, IFacility {

    static Map<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
    static List<Villa> villaList = null;
    static List<Room> roomList = null;
    static List<House> houseList = null;
static  final  String FILE_VILLA= "src\\case_study_module2\\data\\vilaFile.csv";
static  final  String FILE_ROOM= "src\\case_study_module2\\data\\roomFile.csv";
static  final  String FILE_HOUSE= "src\\case_study_module2\\data\\HouseFile.csv";

    static {
        villaList = ReadAndWriteFacility.readVillaList();
        roomList = ReadAndWriteFacility.readRoomList();
        houseList = ReadAndWriteFacility.readHouseList();
    }

    static {
        facilityIntegerLinkedHashMap.put(new House("SVHO-8889", "House", 99.0,
                10000.0, 10, "fhgf", "Chuan", 3), 0);
        facilityIntegerLinkedHashMap.put(new House("SVHO-6454", "House", 99.0,
                10000.0, 10, "fhgf", "Chuan", 3), 9);
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
                System.out.println("t??n d???ch v??? :" + entry.getKey().getTenDichVu() + "c?? m?? d???ch v??? l?? " + entry.getKey().getMaDichVu() + "  s??? l???n booking l?? :" + entry.getValue());
            }
        }
    }

    @Override
    public void display() {
        System.out.println("=========?????????VVilla???=========");
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
        System.out.println("=======??????????????????????????=========");
        for (Room room : roomList
        ) {
            System.out.println(room);
        }
        System.out.println("+=========?????????????O???SE ??????======");
        for (House house : houseList) {
            System.out.println(house);
        }
    }

    public void addVilla() {
        String maDichVu = null;
        do {
            System.out.print(" nh???p m?? d???ch v??? ");
            maDichVu = scanner.nextLine();
        } while (!CheckInput.regexMaDichVuVilla(maDichVu));
        generalMethod();
        String tieuChuanPhong = null;
        do {
            System.out.print(" nh???p ti??u chu???n ph??ng ");
            tieuChuanPhong = scanner.nextLine();
        } while (!CheckInput.regexName(tieuChuanPhong));
        double dienTichHoBoi = 0;
        do {
            System.out.print("di???n t??ch h??? b??i l???n h??n 30m2");
            try {
                dienTichHoBoi = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("nh???p s???");
            }

        } while (dienTichHoBoi < 30);
        int soTang = 0;
        do {
            System.out.print(" nh???p s??? t???ng ");

            try {
                soTang = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("nh???p s???");
            }
        } while (soTang < 0);

        Villa villa = new Villa(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        System.out.println("b???n ch???c ch???n th??m m???i \n Y or N");
        String y = "Y";
        String select = scanner.nextLine();
        if (y.equals(select.toUpperCase())) {
            villaList.add(villa);
            WriteFile.writeListString(FILE_VILLA, villaList, true);
        } else {
            System.out.print(" kh??ng  th??m m???i ");
        }

    }

    public void addRoom() {
        String maDichVu = null;
        do {
            System.out.print(" nh???p m?? d???ch v??? ");
            maDichVu = scanner.nextLine();
        } while (!CheckInput.regexMaDichVuRoom(maDichVu));
        generalMethod();
        String free = null;
        do {
            System.out.print(" ti??u v??? mi???n ph?? ??i k??m ");
            free = scanner.nextLine();
        } while (!CheckInput.regexName(free));


        Room room = new Room(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, free);
        System.out.println("b???n ch???c ch???n th??m m???i \n Y or N");
        String y = "Y";
        String select = scanner.nextLine();
        if (y.equals(select.toUpperCase())) {
            roomList.add(room);
            WriteFile.writeListString(FILE_ROOM, roomList, true);
        } else {
            System.out.println(" kh??ng th??m m???i ");
        }
    }

    public void addHouse() {
        String maDichVu = null;
        do {
            System.out.print(" nh???p m?? d???ch v??? ");
            maDichVu = scanner.nextLine();
        } while (!CheckInput.regexMaDichVuHouse(maDichVu));
        generalMethod();
        String tieuChuanPhong = null;
        do {
            System.out.print(" nh???p ti??u chu???n ph??ng");
            tieuChuanPhong = scanner.nextLine();
        } while (!CheckInput.regexName(tieuChuanPhong));
        int soTang = 0;
        do {
            System.out.print(" nh???p s??? t???ng ");
            soTang = Integer.parseInt(scanner.nextLine());
        } while (soTang < 0);

        House house = new House(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        System.out.println("b???n ch???c ch???n th??m m???i \n Y or N");
        String y = "Y";
        String select = scanner.nextLine();
        if (y.equals(select.toUpperCase())) {
            houseList.add(house);
            WriteFile.writeListString(FILE_HOUSE, houseList, true);
        } else {
            System.out.println(" kh??ng th??m m???i ");
        }
    }

    public void generalMethod() {
        do {
            System.out.print(" nh???p t??n d???ch v???");
            tenDichVu = scanner.nextLine();

            if (!CheckInput.regexName(tenDichVu)) {
                System.out.print(" nh???p sai ");
            } else break;
        } while (true);

        do {
            System.out.print(" nh???p di???n t??ch s??? d???ng");
            try {
                dienTichSuDung = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("no no !!! ");
            }
        } while (dienTichSuDung < 30);
        do {
            System.out.print(" nh???p chi ph?? thu?? ");
            try {
                chiPhiThue = Double.parseDouble(scanner.nextLine());
                if (chiPhiThue > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("no no !!! ");
            }
        } while (true);
        do {
            System.out.println(" nh???p s??? l?????n ng?????i t???i ??a!!l?????ng ng?????i t???i ??a ph???i >0 v?? nh??? h??n <20     ");
            soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        } while (soNguoiToiDa < 0 || soNguoiToiDa > 20);
        do {
            System.out.println(" ki???u thu?? g???m thu?? theo :\nn??m\n th??ng\nng??y\n gi???\n" +
                    "y??u c???u nh???p ????ng ");
            kieuThue = scanner.nextLine();
        } while (!kieuThue.equals("n??m") && !kieuThue.equals("th??ng") && !kieuThue.equals("ng??y") && !kieuThue.equals("gi???"));
    }
}