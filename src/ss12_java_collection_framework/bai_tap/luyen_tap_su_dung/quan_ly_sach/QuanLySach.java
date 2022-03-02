package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung.quan_ly_sach;

import ss12_java_collection_framework.bai_tap.luyen_tap_su_dung.Product;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new LinkedList<>();
static {
    products.add(new Product(100,9,"sách giáo khoa",100000));
    products.add(new Product(3,199099,"sách bài tập ",190000));
    products.add(new Product(6,199099,"từ điển",1002220));
    products.add(new Product(99,199099," sách vật lý ",2000));
}
    public static void themSach() {
        System.out.println(" nhập số luoungj sách ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập id sách ");
        long iDSach = Long.parseLong(scanner.nextLine());
        System.out.println(" nhập têm sản phẩm ");
        String tenSanPham = scanner.nextLine();
        System.out.println(" nhập giá sách ");
        int gia = Integer.parseInt(scanner.nextLine());

        products.add(new Product(soLuong, iDSach, tenSanPham, gia));

    }

    public static void hienThiSach() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void xoaSachBangID() {
        System.out.println(" nhập id sách cản xóa ");
        long iDSachSua = Long.parseLong(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getiDSach() == (iDSachSua)) {
                products.remove(products.get(i));
            }
        }
    }

    public static void timKiemSach() {
        System.out.println("nhập tên sách ");
        String sachTimKiem = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getTenSanPham().equals(sachTimKiem)) {
                System.out.println(products.get(i));
            }
        }
    }

    public static void suaTenTheoID() {
        System.out.println(" nhập ID sách cần sửa");
        long iDSuaTen = Long.parseLong(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getiDSach() == iDSuaTen) {

                System.out.println(" sửa số luoungj sách ");
                int soLuong = Integer.parseInt(scanner.nextLine());
                products.get(i).setSoLuong(soLuong);
                System.out.println(" sửa id sách ");
                long iDSach = Long.parseLong(scanner.nextLine());
                products.get(i).setiDSach(iDSach);
                System.out.println(" sửa têm sản phẩm ");
                String tenSanPham = scanner.nextLine();
                products.get(i).setTenSanPham(tenSanPham);
            }
        }
    }
    public static void sapXep() {
        System.out.println("sắp xếp tăng");
        products.sort(new SortUp());
        System.out.println(products);
        System.out.println("sắp xếp giảm");
        products.sort(new SortDown());
        System.out.println(products);
    }
    public static void hienThiTatCa(){
        System.out.println(products);
    }

}
