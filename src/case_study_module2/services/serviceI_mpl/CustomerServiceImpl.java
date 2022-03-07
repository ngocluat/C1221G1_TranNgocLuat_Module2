package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Customer;
import case_study_module2.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> khachHang = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        khachHang.add(new Customer("trần Vân A", "22-2-2011", " nam", "234567", "abc@gmail.com", "23456", "thân thiết", "cẩm lệ"));
        khachHang.add(new Customer("trần bình B", "22-2-2222", " nữ", "5678", "mncv@gmail.com", "9876", "thân thiết", "liên chiểu"));
    }
    @Override
    public void edit() {
        System.out.println(" nhập tên khách hàng cần sửa");
        String tenKhachHang = scanner.nextLine();
        for (int i = 0; i < khachHang.size(); i++) {
            if (khachHang.get(i).getHoVaTen().equals(tenKhachHang)) {
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
    }


    @Override
    public void add() {
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

    }

    @Override
    public void display() {
        for (int i = 0; i < khachHang.size(); i++) {
            System.out.println(khachHang.get(i));
        }
    }
}
