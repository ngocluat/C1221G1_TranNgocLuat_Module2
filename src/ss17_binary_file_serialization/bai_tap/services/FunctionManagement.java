package ss17_binary_file_serialization.bai_tap.services;

import ss17_binary_file_serialization.bai_tap.model.Product;
import ss17_binary_file_serialization.bai_tap.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionManagement implements IManage {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        System.out.println("nhập id sản phẩm ");
        int iD = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm ");
        String tenSanPham = scanner.nextLine();
        System.out.println(" nhập hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println(" nhâp giá ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println(" nhập mô tả sản phẩm ");
        String moTa = scanner.nextLine();

        Product product = new Product(iD, tenSanPham, hangSanXuat, price, moTa);
        List<Product> products = new ArrayList<>();
        products.add(product);
        ReadAndWriteFile.writeProductToText(products, true);
    }

    @Override
    public void hienThi() {
        List<Product> list = ReadAndWriteFile.readTextFile();
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void xoa() {
        List<Product> list = new ArrayList<>();
        list = ReadAndWriteFile.readTextFile();
        hienThi();
        System.out.println("nhập id sản phẩm cần xóa");
        int iDDelete = Integer.parseInt(scanner.nextLine());

        for (Product lists : list) {
            if (lists.getiD() == iDDelete) {
                list.remove(lists);
                break;
            }
        }
        ReadAndWriteFile.writeProductToText(list, false);

    }
}



