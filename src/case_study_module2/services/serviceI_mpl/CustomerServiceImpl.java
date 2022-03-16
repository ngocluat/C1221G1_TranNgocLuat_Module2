package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Customer;
import case_study_module2.services.ICustomerService;
import case_study_module2.utils.read_and_write_file.ReadAndWriteCostummer;
import case_study_module2.utils.read_and_write_file.regular_expression.CheckInputName;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> khachHang = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        khachHang = ReadAndWriteCostummer.readList();
    }

    @Override
    public void edit() {
        System.out.println(" nhập tên khách hàng cần sửa");
        String tenKhachHang = scanner.nextLine();
        for (int i = 0; i < khachHang.size(); i++) {
            if (khachHang.get(i).getHoVaTen().equals(tenKhachHang)) {
                System.out.println(" 1. you want to fix it all?\n" +
                        "2. edit by selection");
                int choseEdit = Integer.parseInt(scanner.nextLine());
                switch (choseEdit) {
                    case 1:
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
                        ReadAndWriteCostummer.writeList(khachHang,false);
                        break;
                    case 2:
                        System.out.println("1.sửa ngày sinh\n" +
                                "2.sửa loại khách hàng\n" +
                                "3. sửa địa chỉ ");
                        int choseSelection = Integer.parseInt(scanner.nextLine());
                        switch (choseSelection) {
                            case 1:
                                System.out.println("sửa ngày sinh ");
                                String editBirthdaySelect = scanner.nextLine();
                                khachHang.get(i).setNgaySinh(editBirthdaySelect);
                                ReadAndWriteCostummer.writeList(khachHang,false);
                                break;
                            case 2:
                                System.out.println(" sửa loại khách hàng");
                                String suaLoaiKhachHangselect = scanner.nextLine();
                                khachHang.get(i).setLoaiKhachHang(suaLoaiKhachHangselect);
                                ReadAndWriteCostummer.writeList(khachHang,false);
                                break;
                            case 3:
                                System.out.println(" sửa địa chỉ");
                                String suaDiaChiSelect = scanner.nextLine();
                                khachHang.get(i).setDiaChi(suaDiaChiSelect);
                                ReadAndWriteCostummer.writeList(khachHang,false);
                                break;
                        }
                        break;
                }

            }
        }
    }


    @Override
    public void add() {
        System.out.println("thêm mới khách hàng");
        String newName = null;
        do {
            System.out.println(" nhập họ tên ");
            newName = scanner.nextLine();
        } while (!CheckInputName.regexName(newName));

        System.out.println(" ngày sinh ");
        String newBirthday = scanner.nextLine();
        String newGioiTinh = null;

        do {
            System.err.println(" nhạp giới tính\n" +
                    "  nam \n" +
                    " nữ ");
            newGioiTinh = scanner.nextLine();
            if ("nam".equals(newGioiTinh) || "nu".equals(newGioiTinh)) {
                break;
            } else {
                System.out.println(" nhập sai nhập lại");
            }
        } while (true);

        System.out.println("số chứng minh nhân dân");
        String newCMND = scanner.nextLine();
        System.out.println(" nhập email");
        String newMail = scanner.nextLine();
        System.out.println(" mã khách hàng");
        String maKhachhang = scanner.nextLine();

        String loaiKhachHang = null;
        boolean flag = false;
        do {
            System.out.println(" nhập loại khách hàng\n: 1.Diamond\n 2.Platinium\n 3.Gold,\n 4.Silver,\n 5.Member");
            int customerType = Integer.parseInt(scanner.nextLine());
            switch (customerType) {
                case 1:
                    loaiKhachHang = "Diamond";
                    flag = false;
                    break;
                case 2:
                    loaiKhachHang = "Platinium";
                    flag = false;
                    break;
                case 3:
                    loaiKhachHang = "Gold";
                    flag = false;
                    break;
                case 4:
                    loaiKhachHang = "Silver";
                    flag = false;
                    break;
                case 5:
                    loaiKhachHang = "Member";
                    flag = false;
                    break;
                default:
                    flag = true;

            }
        } while (flag);

        System.out.println(" nhập địa chỉ");
        String diaChi = scanner.nextLine();

        Customer customer = new Customer(newName, newBirthday, newGioiTinh, newCMND, newMail, maKhachhang, loaiKhachHang, diaChi);
        addCustmer(customer);
        ReadAndWriteCostummer.writeList(khachHang, false);
    }

    @Override
    public void display() {
        for (Customer customer : khachHang) {
            System.out.println(customer);
        }
    }

    public void addCustmer(Customer customer) {
        khachHang.add(customer);
    }


}
