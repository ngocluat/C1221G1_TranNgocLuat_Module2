package case_study_module2.controlles;

import case_study_module2.model.Customer;
import case_study_module2.model.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {

    static Scanner scanner = new Scanner(System.in);
    static int chose;
    static boolean flag = true;

    static List<Employee> nhanVien = new LinkedList<>();
     static {
         nhanVien.add( new Employee("trần ngọc luật","19-1-2001","nam","234567","luatj1234@gmail.com","00001","tốt", "sếp ",  1888888L));
         nhanVien.add( new Employee("trần ngọc minh","01-1-2011","nữ","155423","trav@gmail.com","00002","tốt", "nhân viên  ",  988888L));
    }
    static List<Customer> khachHang = new LinkedList<>();

    public static void displayMainMenu() {
        do {
            System.out.println(" xin chào \n" +
                    "lựa chọn \n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCostumers Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    System.out.println("xin mời lựa chọn\n" +
                            "1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    int employees = Integer.parseInt(scanner.nextLine());
                    switch (employees) {
                        case 1:
                            for (int i = 0; i < nhanVien.size(); i++) {
                                System.out.println(nhanVien.get(i));
                            }
                            break;
                        case 2:
                            System.out.println("thêm mới ");
                            System.out.println(" nhập họ tên ");
                            String newName = scanner.nextLine();
                            System.out.println(" ngày sinh ");
                            String newBirthday = scanner.nextLine();
                            System.out.println(" nhạp giới tính ");
                            String newGioiTinh = scanner.nextLine();
                            System.out.println("số chứng minh nhân dân");
                            String newCMND = scanner.nextLine();
                            System.out.println(" nhập email");
                            String newMail = scanner.nextLine();
                            System.out.println(" mã nhân viên");
                            String maNhanVien = scanner.nextLine();
                            System.out.println("trình độ ");
                            String trinhDo = scanner.nextLine();
                            System.out.println("vị trí ");
                            String newViTri = scanner.nextLine();
                            System.out.println("lương");
                            long newLuong = Long.parseLong(scanner.nextLine());
                            nhanVien.add(new Employee(newName, newBirthday, newGioiTinh, newCMND, newMail, maNhanVien, trinhDo, newViTri, newLuong));
                            break;
                        case 3:
                            System.out.println(" nhập tên nhân viên cần sửa ");
                            String tenNhanVien = scanner.nextLine();
                            for (int i = 0; i < nhanVien.size(); i++) {
                                if (nhanVien.get(i).getHoVaTen().equals(tenNhanVien)) {
                                    System.out.println(" ngày sinh ");
                                    String editBirthday = scanner.nextLine();
                                    nhanVien.get(i).setNgaySinh(editBirthday);

                                    System.out.println(" nhạp giới tính ");
                                    String editGioiTinh = scanner.nextLine();
                                    nhanVien.get(i).setGioiTinh(editGioiTinh);
                                    System.out.println("số chứng minh nhân dân");
                                    String editCMND = scanner.nextLine();
                                    nhanVien.get(i).setSoCMND(editCMND);
                                    System.out.println(" nhập email");
                                    String editMail = scanner.nextLine();
                                    nhanVien.get(i).seteMail(editMail);
                                    System.out.println(" mã nhân viên");
                                    String editmaNhanVien = scanner.nextLine();
                                    nhanVien.get(i).setMaNhanVien(editmaNhanVien);
                                    System.out.println("trình độ ");
                                    String edittrinhDo = scanner.nextLine();
                                    nhanVien.get(i).setTrinhDo(edittrinhDo);
                                    System.out.println("vị trí ");
                                    String editViTri = scanner.nextLine();
                                    nhanVien.get(i).setViTri(editViTri);
                                    System.out.println(" lương");
                                    long editLuong = Long.parseLong(scanner.nextLine());
                                    nhanVien.get(i).setLuong(editLuong);
                                }
                            }
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println(" nhập sai ");
                    }
                    break;
                case 2:
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    int customer = Integer.parseInt(scanner.nextLine());
                    switch (customer) {
                        case 1:
                            for (int i = 0; i < khachHang.size(); i++) {
                                System.out.println(khachHang.get(i));
                            }
                            break;
                        case 2:
                            System.out.println("thêm mới khách hàng");
                            System.out.println(" nhập họ tên ");
                            String newName = scanner.nextLine();
                            System.out.println(" ngày sinh ");
                            String newBirthday = scanner.nextLine();
                            System.out.println(" nhạp giới tính ");
                            String newGioiTinh = scanner.nextLine();
                            System.out.println("số chứng minh nhân dân");
                            String newCMND = scanner.nextLine();
                            System.out.println(" nhập email");
                            String newMail = scanner.nextLine();
                            System.out.println(" mã khách hàng");
                            String maKhachhang = scanner.nextLine();
                            System.out.println(" nhập loại khách hàng");
                            String loaiKhachHang = scanner.nextLine();
                            System.out.println(" nhập địa chỉ");
                            String diaChi = scanner.nextLine();
                            khachHang.add(new Customer(newName, newBirthday, newGioiTinh, newCMND, newMail, maKhachhang, loaiKhachHang, diaChi));
                            break;
                        case 3:
                            System.out.println(" nhập tên khách hàng cần sửa");
                            String tenKhachHang = scanner.nextLine();
                            for (int i = 0; i < khachHang.size(); i++) {
                                if (khachHang.get(i).equals(tenKhachHang)) {
                                    System.out.println("sửa ngày sinh ");
                                    String editBirthday = scanner.nextLine();
                                    khachHang.get(i).setNgaySinh(editBirthday);
                                    System.out.println(" sửa giới tính ");
                                    String editGioiTinh = scanner.nextLine();
                                    khachHang.get(i).setGioiTinh(editGioiTinh);
                                    System.out.println("sửa số chứng minh nhân dân");
                                    String editCMND = scanner.nextLine();
                                    khachHang.get(i).setSoCMND(editCMND);
                                    System.out.println(" sửa email");
                                    String editMail = scanner.nextLine();
                                    khachHang.get(i).seteMail(editMail);
                                    System.out.println("sửa mã khách hàng");
                                    String editmaKhachhang = scanner.nextLine();
                                    khachHang.get(i).setDiaChi(editmaKhachhang);
                                    System.out.println(" sửa loại khách hàng");
                                    String editloaiKhachHang = scanner.nextLine();
                                    khachHang.get(i).setLoaiKhachHang(editloaiKhachHang);
                                    System.out.println(" sửa địa chỉ");
                                    String editdiaChi = scanner.nextLine();
                                    khachHang.get(i).setDiaChi(editdiaChi);
                                }
                            }
                            break;
                        case 4:
                            break;

                    }
                    break;
                case 3:
                    System.out.println("xin mời lựa chọn\n" +
                            "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    int facility = Integer.parseInt(scanner.nextLine());
                    switch (facility) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;

                    }
                    break;
                case 4:
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    int Booking = Integer.parseInt(scanner.nextLine());
                    switch (Booking) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;

                    }
                    break;
                case 5:
                    System.out.println("xin mời lựa chọn\n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int promotion = Integer.parseInt(scanner.nextLine());
                    switch (promotion) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 6:
                    flag = false;
                    break;


            }
        } while (flag);


    }


}