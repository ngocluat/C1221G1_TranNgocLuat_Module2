package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Employee;
import case_study_module2.services.IEmployeeService;
import case_study_module2.utils.read_and_write_file.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        List<Employee> nhanVien = ReadAndWriteEmployee.readList();
        System.out.println(" nhập tên mã nhân viên cần sửa ");
        String maNhanVien = null;
        try {
            maNhanVien = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < nhanVien.size(); i++) {
            if (nhanVien.get(i).getMaNhanVien().equals(maNhanVien)) {
                System.out.println(" 1. you want to fix it all?\n" +
                        "2. edit by selection");
                int choseEdit = Integer.parseInt(scanner.nextLine());
                switch (choseEdit) {
                    case 1:
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
                        ReadAndWriteEmployee.writeList(nhanVien, false);
                        break;


                    case 2 :
                        System.out.println("1.sửa ngày sinh\n" +
                                "2.sửa loại trình dộ \n" +
                                "3. sửa lương \n" +
                                "4. sửa vị trí\n");
                        int choseSelection = Integer.parseInt(scanner.nextLine());
                        switch (choseSelection) {
                            case 1:
                                System.out.println("sửa ngày sinh ");
                                String editBirthdaySelect = scanner.nextLine();
                                nhanVien.get(i).setNgaySinh(editBirthdaySelect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
                                break;
                            case 2:
                                System.out.println(" sửa trình độ ");
                                String edittrinhDoSelect = scanner.nextLine();
                                nhanVien.get(i).setTrinhDo(edittrinhDoSelect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
                                break;
                            case 3:
                                System.out.println(" lương");
                                long editLuongSelect = Long.parseLong(scanner.nextLine());
                                nhanVien.get(i).setLuong(editLuongSelect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
                                break;
                            case 4:
                                System.out.println("vị trí ");
                                String editViTriSekect = scanner.nextLine();
                                nhanVien.get(i).setViTri(editViTriSekect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
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

        Employee employee = new Employee(newName, newBirthday, newGioiTinh, newCMND, newMail, maNhanVien, trinhDo, newViTri, newLuong);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWriteEmployee.writeList(employeeList, true);
    }

    @Override
    public void display() {
        List<Employee> moToList = ReadAndWriteEmployee.readList();
        for (int i = 0; i < moToList.size(); i++) {
            System.out.println((1 + i) + "." + moToList.get(i));
        }
    }

}
