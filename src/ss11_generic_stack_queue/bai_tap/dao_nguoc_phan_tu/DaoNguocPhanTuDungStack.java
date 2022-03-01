package ss11_generic_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuDungStack {

    public static void main(String[] args) {
        DaoNguocPhanTuDungStack.daoNguocSoNguyen();
        DaoNguocPhanTuDungStack.daoNguocChuoi();
    }
   static Scanner scanner = new Scanner(System.in);

    public static void daoNguocChuoi() {
        System.out.println(" đảo ngược chuổi");
        System.out.println(" nhập chuổi ");
        String chuoi = scanner.nextLine();
        String[] mang = chuoi.split("");
        String result = "";

        Stack<String> strings = new Stack<>();
        for (int i = 0; i < mang.length; i++) {
            strings.push(mang[i]);
        }

        while (!strings.isEmpty()) {
            result += strings.pop();
        }
        System.out.println(result);
    }

    public static void daoNguocSoNguyen() {
        System.out.println(" đảo ngược số  nguyên");
        System.out.println("nhập số lượng phần tử trong mảng");
        int soLuong= Integer.parseInt(scanner.nextLine());
        int[] arrInterger = new int[soLuong];

        for (int i = 0; i <arrInterger.length ; i++) {
            System.out.println(" nhập phần tử thứ "+ (i+1));
           arrInterger[i]= Integer.parseInt(scanner.nextLine());
        }

        Stack<Integer> integers = new Stack<>();

        for (int i = 0; i < arrInterger.length; i++) {
            integers.push(arrInterger[i]);
        }

        for (int i = 0; i < arrInterger.length; i++) {
            arrInterger[i] = integers.pop();
        }
        System.out.println(Arrays.toString(arrInterger));

    }
}

