package test_example.vi_du_nho.add_test;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        ProductMamager productMamager = new ProductMamager();

        System.out.println();
        System.out.println(" nhập Id");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập name");
        String name = scanner.nextLine();
        System.out.println(" nhập price ");
        int pricec = Integer.parseInt(scanner.nextLine());
        Product product= new Product(id,name,pricec);
        productMamager.add(product);
    }
}
