package bai_tap_lam_themOOP1.Bai1;

import java.util.Scanner;

public class MenuVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("nhập số lượng xe");

        Vehicle[] vehicle = new Vehicle[10];
//        System.out.println(" xe trưng bày");
//        Vehicle vehicle1 = new Vehicle(" luật ", 19, 1200000, 110);
//        Vehicle vehicle2 = new Vehicle("linh", 15, 2100000, 180);
//        System.out.println(vehicle1);
//        System.out.println(vehicle2);
        vehicle[0] = new Vehicle(" luật ", 19, 1200000, 110);
        vehicle[1] = new Vehicle("linh", 15, 210000, 180);
        do {
            System.out.println(" nhập lựa chon cauaru bạn\n" +
                    "1. tạo đối tương xe và nhập thông tin\n" +
                    "2. xuất bả kê kahi tiền thuế\n " +
                    " 3. thoát");
            int luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 1:
//                    int soLuongXe = Integer.parseInt(scanner.nextLine());
                    System.out.println(" nhập tên");
                    String ten = scanner.nextLine();
                    System.out.println(" nhập tuổi");
                    int tuoi = Integer.parseInt(scanner.nextLine());
                    System.out.println(" nhập giá trị xe ");
                    int giaTri = Integer.parseInt(scanner.nextLine());
                    System.out.println(" nhập dung tích xi lanh");
                    int dungTichXiLanh = Integer.parseInt(scanner.nextLine());
                    int index = 0;
                   for (int i = 0; i < vehicle.length; i++) {
                       if (vehicle[i] == null) {
                           index = i;
                           break;
                       }


                   }
                    vehicle[index] = new Vehicle(ten, tuoi, giaTri, dungTichXiLanh);
                    break;
                case 2:
                    for (Vehicle element : vehicle) {
                        System.out.println(element);
                        element.tienThue();
                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }

        }while (flag);

    }
}
