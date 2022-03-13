package ss17_binary_file_serialization.bai_tap_binary_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCRUD implements ICRUD {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    static ProductImpl productManager = new ProductImpl();
    static ReadAndWriteFileBinary readAndWriteFile = new ReadAndWriteFileBinary();

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm");
        String id = sc.nextLine();

        System.out.println("Nhập tên sản phẩm");
        String nameProduct = sc.nextLine();

        System.out.println("Hãng sản xuất");
        String nameProducer = sc.nextLine();

        System.out.println("Giá sản phẩm");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println("Mô tả sản phẩm");
        String description = sc.nextLine();
        Product product = new Product(id, nameProduct, nameProducer, price, description);
        productList = readAndWriteFile.readFileBinary();
        productList.add(product);
        readAndWriteFile.writeFileBinary(productList);
    }

    @Override
    public void seaching() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String inputString = sc.nextLine();
        List<Product> productList = readAndWriteFile.readFileBinary();
        List<Product> result = productManager.search(inputString, productList);
        productManager.display(result);
    }

    @Override
    public void disPlay() {
        List<Product> productList1 = readAndWriteFile.readFileBinary();
        productManager.display(productList1);
    }
}
