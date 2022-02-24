package ss2_vong_lap_trong_java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}

