package case_study_module2.services.serviceI_mpl;

import case_study_module2.model.Employee;
import case_study_module2.services.IEmployeeService;
import case_study_module2.utils.read_and_write_file.ReadAndWriteEmployee;
import case_study_module2.utils.read_and_write_file.regular_expression.CheckInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        List<Employee> nhanVien = ReadAndWriteEmployee.readList();
        System.out.print(" nhập mã nhân viên cần sửa ");
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
                int choseEdit = 0;
                try {
                    choseEdit = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(" hình như bạn nhập sai  ");
                }
                switch (choseEdit) {
                    case 1:
                        System.out.print(" ngày sinh ");
                        String editBirthday = scanner.nextLine();
                        nhanVien.get(i).setNgaySinh(editBirthday);
                        System.out.print(" nhạp giới tính ");
                        String editGioiTinh = scanner.nextLine();
                        nhanVien.get(i).setGioiTinh(editGioiTinh);
                        System.out.print("số chứng minh nhân dân");
                        String editCMND = scanner.nextLine();
                        nhanVien.get(i).setSoCMND(editCMND);
                        System.out.print(" nhập email");
                        String editMail = scanner.nextLine();
                        nhanVien.get(i).seteMail(editMail);
                        System.out.print(" mã nhân viên");
                        String editmaNhanVien = scanner.nextLine();
                        nhanVien.get(i).setMaNhanVien(editmaNhanVien);
                        System.out.print("trình độ ");
                        String edittrinhDo = scanner.nextLine();
                        nhanVien.get(i).setTrinhDo(edittrinhDo);
                        System.out.print("vị trí ");
                        String editViTri = scanner.nextLine();
                        nhanVien.get(i).setViTri(editViTri);

                        long editLuong = 0;
                        try {
                            System.out.print(" lương");
                            editLuong = Long.parseLong(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.print("bạn nhập lương của nhân viên không đúng ");
                        }
                        nhanVien.get(i).setLuong(editLuong);
                        ReadAndWriteEmployee.writeList(nhanVien, false);
                        break;
                    case 2:
                        System.out.println("1.sửa ngày sinh\n" +
                                "2.sửa loại trình dộ \n" +
                                "3. sửa lương \n" +
                                "4. sửa vị trí\n");
                        int choseSelection =-1;
                        try {
                           choseSelection = Integer.parseInt(scanner.nextLine());
                      }catch (NumberFormatException e){
                          System.out.println(" lỗi ");
                      }
                        switch (choseSelection) {
                            case 1:
                                System.out.print("sửa ngày sinh ");
                                String editBirthdaySelect = scanner.nextLine();
                                nhanVien.get(i).setNgaySinh(editBirthdaySelect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
                                break;
                            case 2:
                                System.out.print(" sửa trình độ ");
                                String edittrinhDoSelect = scanner.nextLine();
                                nhanVien.get(i).setTrinhDo(edittrinhDoSelect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
                                break;
                            case 3:
                                System.out.print("  sửa lương");
                                long editLuongSelect = 6000000;
                                try {
                                    editLuongSelect = Long.parseLong(scanner.nextLine());
                                } catch (NumberFormatException e) {
                                    System.out.print("bạn nhập lương của nhân viên không đúng ");
                                }
                                nhanVien.get(i).setLuong(editLuongSelect);
                                ReadAndWriteEmployee.writeList(nhanVien, false);
                                break;
                            case 4:
                                System.out.print(" sửa vị trí ");
                                String editViTriSekect =  scanner.nextLine();
                                String y = "Y";
                                   System.out.println(" bạn có muốn chắc chắn sửa Y/N ");
                                   String selection= scanner.nextLine();
                                    if (selection.toUpperCase().equals(y)){
                                        nhanVien.get(i).setViTri(editViTriSekect);
                                        ReadAndWriteEmployee.writeList(nhanVien, false);
                                    }else {
                                        System.out.println("không sửa nhá ");
                                    }
                                break;
                        }
                        break;

                }
            }
        }

    }

    @Override
    public void add() {
        String newName = null;
        System.out.print("thêm mới ");
        do {
            System.out.print(" nhập họ tên ");
            newName = scanner.nextLine();
        } while (!CheckInput.regexName(newName));
        String newBirthday = null;
        do {
            System.out.print(" ngày sinh ");
            newBirthday = scanner.nextLine();
        } while (!CheckInput.regexNgaySinh(newBirthday));
        String newGioiTinh = "";
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
        System.out.print("số chứng minh nhân dân");
        String newCMND = scanner.nextLine();
        String newMail = "";
        do {
            System.out.print(" nhập email");
            newMail = scanner.nextLine();
        } while (!CheckInput.regexEmail(newMail));
        System.out.print(" mã nhân viên");
        String maNhanVien = scanner.nextLine();
        String trinhDo = null;
        do {
            System.out.println("trình độ\n trung cap,\n cao đang,\n dai hoc \n sau dai hoc");
            trinhDo = scanner.nextLine();
            if (trinhDo.equals("trung cap") || trinhDo.equals("cao dang") || trinhDo.equals("dai hoc") || trinhDo.equals("sau dai hoc")) {
                break;
            } else {
                System.err.println("yêu cầu nhập đúng trình độ ");
            }

        } while (true);
        String newViTri = null;
        boolean flag = false;
        do {
            System.out.println("vị trí của khách hàng :\n 1.Lễ tân\n 2.phục vụ\n 3.chuyên viên\n 4.giám sát\n 5.quản lý\n 6.giám đốc ");
            int chosePosition = Integer.parseInt(scanner.nextLine());
            switch (chosePosition) {
                case 1:
                    newViTri = "Lễ Tân";
                    flag = false;
                    break;
                case 2:
                    newViTri = "Phục Vụ";
                    flag = false;
                    break;
                case 3:
                    newViTri = "Chuyên Viên";
                    flag = false;
                    break;
                case 4:
                    newViTri = "Giám Sát";
                    flag = false;
                    break;
                case 5:
                    newViTri = "Quản Lý ";
                    flag = false;
                    break;
                case 6:
                    newViTri = "GIÁM ĐỐC";
                    flag = false;
                    break;
                default:
                    flag = true;
            }

        } while (flag);

        long newLuong = 6000000;// basic salary
        try {
            System.out.print("lương");
            newLuong = Long.parseLong(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Employee employee = new Employee(newName, newBirthday, newGioiTinh, newCMND, newMail, maNhanVien, trinhDo, newViTri, newLuong);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWriteEmployee.writeList(employeeList, true);
    }


    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteEmployee.readList();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((1 + i) + "." + employeeList.get(i));
        }
    }

}
