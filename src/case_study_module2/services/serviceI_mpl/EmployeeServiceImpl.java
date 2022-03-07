package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Employee;
import case_study_module2.services.IEmployeeService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> nhanVien = new LinkedList<>();

    static {
        nhanVien.add(new Employee("trần ngọc luật", "19-1-2001", "nam", "234567", "luatj1234@gmail.com", "00001", "tốt", "sếp ", 1888888L));
        nhanVien.add(new Employee("trần ngọc minh", "01-1-2011", "nữ", "155423", "trav@gmail.com", "00002", "tốt", "nhân viên  ", 988888L));
    }

    @Override
    public void edit() {
        System.out.println(" nhập tên nhân viên cần sửa ");
        String tenNhanVien = scanner.nextLine();
        for (int i = 0; i < nhanVien.size(); i++) {
            if (nhanVien.get(i).getHoVaTen().equals(tenNhanVien)) {
                System.out.println(" 1. you want to fix it all?\n" +
                        "2. edit by selection");
                int choseEdit = Integer.parseInt(scanner.nextLine());
                switch (choseEdit) {
                    case 1 :

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
                        break;


                    case 2 :
                        System.out.println("1.sửa ngày sinh\n" +
                                "2.sửa loại trình dộ \n" +
                                "3. sửa lương ");
                        int choseSelection = Integer.parseInt(scanner.nextLine());
                        switch (choseSelection) {
                            case 1:
                                System.out.println("sửa ngày sinh ");
                                String editBirthdaySelect = scanner.nextLine();
                                nhanVien.get(i).setNgaySinh(editBirthdaySelect);
                                break;
                            case 2:
                                System.out.println(" sửa trình độ ");
                                String edittrinhDoSelect = scanner.nextLine();
                                nhanVien.get(i).setTrinhDo(edittrinhDoSelect);
                                break;
                            case 3:
                                System.out.println(" lương");
                                long editLuongSelect = Long.parseLong(scanner.nextLine());
                                nhanVien.get(i).setLuong(editLuongSelect);
                                break;
                        }
                        break;

                }

            }
        }
    }

    @Override
    public void add() {
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

    }

    @Override
    public void display() {
        for (int i = 0; i < nhanVien.size(); i++) {
            System.out.println(nhanVien.get(i));
        }
    }
}
