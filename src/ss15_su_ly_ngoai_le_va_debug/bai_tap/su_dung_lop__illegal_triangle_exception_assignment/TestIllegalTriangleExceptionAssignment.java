package ss15_su_ly_ngoai_le_va_debug.bai_tap.su_dung_lop__illegal_triangle_exception_assignment;

import java.util.Scanner;

public class TestIllegalTriangleExceptionAssignment {

    public void kiemTraTamGiac() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập cạnh A của tam Giác ");
        int canhA = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập cạnh b ");
        int canhB = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập cạnh c ");
        int canhC = Integer.parseInt(scanner.nextLine());
        try {
            checkTriangle(canhA, canhB, canhC);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("kết thúc chương trình");
        }
    }

    public static void checkTriangle(double canhA, double canhB, double canhC) throws IllegalTriangleException {
        if (canhA < 0 || canhB < 0 || canhC < 0) {
            throw new IllegalTriangleException("3 cạnh không tạo thành 1 tam giác  ");
        }
        if (canhA + canhB < canhC) {
            throw new IllegalTriangleException("cạnh a + cạnh B không bằng cạnh c");
        } else if (canhA + canhC < canhB) {
            throw new IllegalTriangleException("cạnh A + cạnh C không bằng cạnh B");
        } else {
            throw new IllegalTriangleException("cạnh B + cạnh C không bằng cạnh A");
        }
    }


}
