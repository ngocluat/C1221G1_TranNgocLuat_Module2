package test_example.vi_du_nho.BaiStudent;

import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) {
        StudidenManager studidenManager = new StudidenManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Menu\n" +
                    "1 display\n" +
                    "2. add\n" +
                    "3. edit\n" +
                    "4 delete\n" +
                    "5. exit\n");
            System.out.println(" chon chưc năng ");
            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println(" danh sách các sinh viên");
                    studidenManager.showlistStudent();
                    break;
                case 2:
                    Scanner sc = new Scanner(System.in);

                    System.out.println(" thêm các sinh viên");
                    System.out.println(" nhập Id sinh viên");
                    int id = sc.nextInt();

                    System.out.println(" nhập tên sinhviên");
                    String name = sc.nextLine();

                    System.out.println(" nhập lớp");
                    String className = sc.nextLine();

                    System.out.println(" nhập truòng");
                    String school = sc.nextLine();
//                    studidenManager.add(id, name, className, school);
                    break;
            }
        }
        while (flag);

    }


}
