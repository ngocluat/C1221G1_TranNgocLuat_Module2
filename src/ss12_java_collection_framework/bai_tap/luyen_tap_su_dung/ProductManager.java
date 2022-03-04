package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung.quan_ly_sach.QuanLySach;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" xin chào ");
        boolean flag = true;

        do {
            System.out.println(" xin lựa chọn\n" +
                    "1. thêm sách \n" +
                    "2. sửa sảng phảm thei ID\n" +
                    "3. xóa sản phẩm theo ID\n" +
                    "4. hiển thị sản phẩn theo tên\n" +
                    "5. tiềm kiếm sản phẩm theo tên\n" +
                    "6.sắp xếp sản phẩm theo giá\n" +
                    "7. hiển thị tất cả sản phẩm ");
            int luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 1:
                    QuanLySach.themSach();
                    break;
                case 2:
                    QuanLySach.suaTenTheoID();
                    break;
                case 3:
                    QuanLySach.hienThiSach();
                    QuanLySach.xoaSachBangID();
                    break;
                case 4:
                    QuanLySach.hienThiSach();
                    break;
                case 5:
                    QuanLySach.timKiemSach();
                    break;
                case 6:
                    QuanLySach.sapXep();
                    QuanLySach.sapXepTheoTen();
                    break;
                case  7 :
                    QuanLySach.hienThiTatCa();
                    break;
                default:
                    System.out.println("nhập sai");
            }
        } while (flag);
    }
}
