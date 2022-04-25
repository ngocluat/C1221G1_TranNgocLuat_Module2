package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Booking;
import case_study_module2.model.Contract;
import case_study_module2.services.BookingCompater;
import case_study_module2.services.FunctionBokking;
import case_study_module2.services.IBookingService;
import case_study_module2.services.IContractService;
import case_study_module2.utils.read_and_write_file.ReadAndWriteBooking;
import case_study_module2.utils.read_and_write_file.WriteBooking;
import case_study_module2.utils.read_and_write_file.WriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingServiceImlp implements IBookingService, IContractService, Comparator<Booking> {
    private static final String NAME_FILE = "src\\case_study_module2\\data\\booking.csv";
    private static final String NAME_FILE_CONTRACT = "src\\case_study_module2\\data\\contracFile.csv";
    Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingCompater());
    static List<Contract> contractList = null;
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    static {
        bookingSet = ReadAndWriteBooking.readSet();
        contractList = ReadAndWriteBooking.readListConTract();

    }

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDatel = LocalDate.parse(o1.getNgayBatDau(), formatter);
        LocalDate startDate2 = LocalDate.parse(o2.getNgayBatDau(), formatter);
        LocalDate endDatel = LocalDate.parse(o2.getNgayKetThuc(), formatter);

        LocalDate endDate2 = LocalDate.parse(o2.getNgayKetThuc(), formatter);
        if (startDatel.compareTo(startDate2) < 0) {
            return 1;
        } else if (startDatel.compareTo(startDate2) < 0) {
            return -1;
        } else {
            if (endDatel.compareTo(endDate2) > 0) {
                return 1;
            } else if (endDatel.compareTo(endDate2) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }


    @Override
    public void add() {

        System.out.println("danh sách khách hàng ");
        customerService.display();
        System.out.println("============thêm mới booking===========");
        System.out.println(" nhập mã booking ");
        String maBokking = scanner.nextLine();
        System.out.println(" nhập ngày bắt đầu ");
        String ngayBatDau = scanner.nextLine();
        System.out.println(" nhập ngày kết thuc ");
        String ngayKetThuc = scanner.nextLine();
        System.out.println(" nhập mã khách hàng ");
        String maKhachHang = scanner.nextLine();
        System.out.println(" nhập tên dịch vụ ");
        String tenDichVu = scanner.nextLine();
        System.out.println(" nhập loại dịch vụ ");
        String loaiDichVu = scanner.nextLine();
        Booking booking = new Booking(maBokking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
        bookingSet.add(booking);
        WriteBooking.writeListString(NAME_FILE, bookingSet, true);
    }

    @Override
    public void display() {
        for (Booking s : bookingSet) {
            System.out.println(s);
        }
    }


    @Override
    public void createNewContract() {
        String soHopDong = FunctionBokking.soHopDong();
        String maBooking = FunctionBokking.maBooking();
        double soTienCocTruoc = FunctionBokking.soTienCocTruoc();
        double tongSoTienThanhToan = FunctionBokking.tongSoTienThanhToan();
        String maKhachHang = FunctionBokking.maKhachHang();
        Contract contract = new Contract(soHopDong, maBooking, soTienCocTruoc, tongSoTienThanhToan, maKhachHang);
        contractList.add(contract);
        WriteFile.writeListString(NAME_FILE_CONTRACT, contractList, true);

    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void editContract() {
        System.out.println("nhập số hợp đồng bà bạn muốn sửa");
        String soHopDong = scanner.nextLine();
        for (Contract item : contractList) {
            if (item.getSoHopDong().equals(soHopDong)) {
                int choise = 0;
                String s = null;
                do {
                    System.out.println("bạn muốn sửa  cái nào \n" +
                            "1. so Hop Dong;\n" +
                            "2. ma Booking;\n" +
                            "3. xso Tien Coc Truoc;\n" +
                            "4. tong So Tien Thanh Toan;\n" +
                            "5. ma Khach Hang;\n");
                    try {
                        choise = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {

                        System.out.println(" nhập sai !! ");
                    }

                    switch (choise) {
                        case 1:
                            System.out.println(" sửa  số hợp dồng của bạn");
                            String suaSoHopDong = scanner.nextLine();
                            item.setSoHopDong(suaSoHopDong);
                            break;
                        case 2:
                            System.out.println(" sửa mã booking của bạn");
                            String maBooking = scanner.nextLine();
                            item.setMaBooking(maBooking);
                            break;
                        case 3:
                            System.out.println(" sửa số tiền cọc trước của bạn");
                            double soTien = Double.parseDouble(scanner.nextLine());
                            item.setSoTienCocTruoc(soTien);
                            break;
                        case 4:
                            System.out.println(" sửa số tiền thanh toán  của bạn");
                            double soTienThanhToan = Double.parseDouble(scanner.nextLine());
                            item.setTongSoTienThanhToan(soTienThanhToan);
                            break;
                        default:
                            System.out.println("bạn nhập sai !!1");
                    }
                    System.out.println(" bạn có muốn sửa tiếp không Y/N !!");
                    s = scanner.nextLine().toLowerCase();
                } while ("y".equals(s));
                WriteFile.writeListString(NAME_FILE_CONTRACT, contractList, false);
            }
        }
    }
}
