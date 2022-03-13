package ss17_binary_file_serialization.bai_tap_binary_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    static ProductImpl productManager = new ProductImpl();
    static ReadAndWriteFileBinary readAndWriteFile = new ReadAndWriteFileBinary();

    static ManagerCRUD managerCRUD = new ManagerCRUD();

    public static void displayMenu() {
        int choice;
        do {
            System.out.println("Menu sản phẩm.\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Tìm kiếm sản phẩm\n" +
                    "3. Hiển thị sản phẩm\n" +
                    "4. Thoát\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    managerCRUD.add();
                    managerCRUD.disPlay();
                    break;
                case 2:
                    managerCRUD.seaching();
                    break;
                case 3:
                    managerCRUD.disPlay();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Sai cú pháp mời nhập lại");
            }
        } while (choice != 4);
    }
}
