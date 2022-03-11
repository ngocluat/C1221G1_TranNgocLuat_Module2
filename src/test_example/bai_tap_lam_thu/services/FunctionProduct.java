package test_example.bai_tap_lam_thu.services;

import test_example.bai_tap_lam_thu.model.Product;
import test_example.bai_tap_lam_thu.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionProduct implements IFunction {
    Scanner scanner= new Scanner( System.in);
    @Override
    public void them() {
        System.out.println(" nhaapj id sanr phẩm ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập tên sản phẩm ");
        String tenSanPham= scanner.nextLine();
        Product product= new Product(id,tenSanPham);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        ReadAndWrite.writeListToCSV(productList,true);

    }

    @Override
    public void sua() {

    }

    @Override
    public void timKiem() {
        List<Product> productList = ReadAndWrite.readListFromCSV();
        System.out.println(" nhập id bạn muốn tìm kiếm ");
        int iDToemKiem= Integer.parseInt(scanner.nextLine());
        for (Product s :productList
             ) {
            if (s.getId()==iDToemKiem){
                System.out.println(s);
            }
        }

    }

    @Override
    public void xoa() {

    }

    @Override
    public void hienThi() {
        List<Product> productList = ReadAndWrite.readListFromCSV();
        for (int i = 0; i <productList.size() ; i++) {
            System.out.println((1+i)+"."+ productList.get(i));
        }
    }
}
