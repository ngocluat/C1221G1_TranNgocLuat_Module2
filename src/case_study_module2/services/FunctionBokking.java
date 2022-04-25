package case_study_module2.services;

import case_study_module2.utils.read_and_write_file.regular_expression.CheckInput;

import java.util.Scanner;

public class FunctionBokking {
    static Scanner scanner = new Scanner(System.in);

    public static String soHopDong() {
        String soHopDong;
        do {
            System.out.println(" nhập số hợp dồng bắt đầu từ số 0 và có tối đa 5 chử số ");
            soHopDong = scanner.nextLine();
            if (CheckInput.regexSoHopDongMa(soHopDong)) {
                break;
            } else {
                System.out.println("nhập sai !!! ");
            }
        } while (true);
        return soHopDong;
    }


    public static String maBooking() {
        String maBooking = null;
        do {
            System.out.println(" nhập mã booking  bắt đầu từ số 0 và có tối đa 5 chử số");
            maBooking = scanner.nextLine();
            if (CheckInput.regexSoHopDongMa(maBooking)) {
                break;
            } else {
                System.out.println("nhập sai !!! ");
            }
        } while (true);
        return maBooking;
    }

    public static double soTienCocTruoc() {
        double soTienCocTruocf = 0;
        do {
            System.out.println(" nhập số tiền cọc trước  ");
            try {
                soTienCocTruocf = Double.parseDouble(scanner.nextLine());
                if (soTienCocTruocf > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("bạn nhập sai số tiền");
            }
        } while (true);
        return soTienCocTruocf;
    }

    public static double tongSoTienThanhToan() {
        double tongSoTienThanhToan1 = 0;
        do {
            System.out.println(" nhập số tổng số tiềm thanh toán ");
            try {
                tongSoTienThanhToan1 = Double.parseDouble(scanner.nextLine());
                if (tongSoTienThanhToan1 > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("bạn nhập sai số tiền");
            }
        } while (true);
        return tongSoTienThanhToan1;
    }

    public static String maKhachHang() {
        String maKhachHang1 = null;
        do {
            System.out.println(" nhập mã khách hàng  bắt đầu từ số 0 và có tối đa 5 chử số");
            maKhachHang1 = scanner.nextLine();
            if (CheckInput.regexSoHopDongMa(maKhachHang1)) {
                break;
            } else {
                System.out.println(" nhập sai ");
            }
        } while (true);
        return maKhachHang1;
    }
}
