package bai_thi_module2.services;

import bai_thi_module2.model.GiaoVien;
import bai_thi_module2.model.SinhVien;
import bai_thi_module2.utils.CheckInput;
import bai_thi_module2.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionManager implements IFuntcion {
    static Scanner scanner = new Scanner(System.in);
    static List<SinhVien> sinhViens = null;
    static List<GiaoVien> giaoViens = null;

    static {
        sinhViens = ReadWriteFile.readListSinhVien();
        giaoViens = ReadWriteFile.readListGiaoVien();
    }

    private static final String NAME_FILE = "src\\bai_thi_module2\\data\\students.csv";


    @Override
    public void themMoiSinhVien() {
        int maSinhVien;
        if (sinhViens.size() == 0) {
            maSinhVien = 1;
        } else {
            maSinhVien = (sinhViens.get(sinhViens.size() - 1).getMaSinhVien()) + 1;
        }

        String tenSinhVien = null;
        do {
            System.out.println(" nhập tên sinh viên ");
            tenSinhVien = scanner.nextLine();
            if (CheckInput.regexName(tenSinhVien)) {
                break;
            } else {
                System.out.println(" bạn nhập sai định dạng tên !! \n" +
                        "yêu cầu viết hoa chữ dầu tiên của ten  ");
            }
        } while (true);
        String nagySinh = null;
        do {
            System.out.println(" ngày sinh của sinh viên ");
            nagySinh = scanner.nextLine();
            if (CheckInput.regexNgaySinh(nagySinh)) {
                break;
            } else {
                System.out.println("bạn nhập sai định dạng ngày sinh \n" +
                        "theo định dạng " + " dd/MM/yyyy");
            }
        } while (true);
        String gioiTinh = null;
        do {
            System.out.print(" nhạp giới tính\n" +
                    "  nam \n" +
                    "  nu \n");
            gioiTinh = scanner.nextLine();
            if ("nam".equals(gioiTinh) || "nu".equals(gioiTinh)) {
                break;
            } else {
                System.out.println(" nhập sai nhập lại");
            }
        } while (true);

        String soDienThoai = null;
        do {
            System.out.println(" số điện thoại của sinh viên");
            soDienThoai = scanner.nextLine();
            if (CheckInput.phone(soDienThoai)) {

                break;

            } else {
                System.out.println(" số điện thoại chỉ có 10 số và bắt đầu bằng số 0");
            }
        } while (true);

        System.out.println(" mã lớp học của sinh viên");

        String maLopHoc = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(maSinhVien, tenSinhVien, nagySinh, gioiTinh, soDienThoai, maLopHoc);
        sinhViens.add(sinhVien);
        ReadWriteFile.writeListString(NAME_FILE, sinhViens, false, "===> đă thêm thành công ");

    }

    @Override
    public void xoaSinhVien() throws NotFoundStudentExcaption {
        System.out.println("nhập id sinh viên cần xóa ");
        int idXoa = -1;
        do {
            try {
                idXoa = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" nhập sai ");
            }
        } while (idXoa < 0);
        boolean flag = false;
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getMaSinhVien() == idXoa) {

                System.out.println("banjn có muốn chắn chắn xóa hay không Y/ N??");
                String chon = scanner.nextLine();
                if ("y".equals(chon.toLowerCase())) {
                    sinhViens.remove(sinhViens.get(i));
                    System.out.println(" đã xóa thành công ");
                    flag = true;
                    ReadWriteFile.writeListString(NAME_FILE, sinhViens, false, "");
                    xemDanhScahSinhVien();
                } else {
                    System.out.println(" không xóa ");
                }
            } else {
                flag = false;

            }
        }
        if (!flag) {
            throw new NotFoundStudentExcaption("không tìm thấy id sinh viên bạn muốn xóa ");
        }


    }

    @Override
    public void xemDanhScahSinhVien() {
        if (sinhViens.size() == 0) {
            System.out.println(" không có sinh viên nào trong hệ thống");
        } else {
            System.out.println(" ========tất cả các sinh viên có trong file=======");
            for (SinhVien item : sinhViens) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void xemThongTinGiaoVien() {
        if (giaoViens.size() == 0) {
            System.out.println(" không có gì trong file giaoVien.csv");
        } else {
            System.out.println(" ======đây là tất cả các thông tin của giá viên====== ");
            for (GiaoVien item : giaoViens
            ) {
                System.out.println(item);
            }
        }


    }

    @Override
    public void timKiemSinhVien() {
        System.out.println(" =========bạn hãy nhập tên giáo viên mà bạn đang muốn tìm kiếm======");
        String tenSinhVien = scanner.nextLine();
        List<SinhVien> sinhVienList = new ArrayList<>();
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getTenSinhVien().contains(tenSinhVien)) {
                sinhVienList.add(sinhVien);
            }
        }
        for (SinhVien item : sinhVienList
        ) {
            System.out.println(item);
        }
    }
}
