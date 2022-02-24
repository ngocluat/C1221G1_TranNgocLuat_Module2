package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number A");
        double soA = scanner.nextDouble();
        System.out.println("enter number B");
        double soB = scanner.nextDouble();
        System.out.println("enter number C");
        double soC = scanner.nextDouble();

        PhuongTrinh phuongTrinh = new PhuongTrinh(soA, soB, soC);
        double delta = phuongTrinh.getDiscriminant();
        phuongTrinh.ketQua();

        System.out.println(delta);


    }
}

class PhuongTrinh {
    double SoA, SoB, SoC;

    PhuongTrinh(double SoA, double SoB, double SoC) {
        this.SoA = SoA;
        this.SoB = SoB;
        this.SoC = SoC;
    }

    public double getSoA() {
        return this.SoA;
    }

    public double getSoB() {
        return this.SoB;
    }

    public double getSoC() {
        return this.SoC;
    }

    double getDiscriminant() {
        // getDiscriminant() trả về delta theo công thức delta = b2 - 4ac.
        double delta = (Math.pow(this.SoB, 2)) - (4 * this.SoA * this.SoC);
        return delta;
    }

    void ketQua() {
        if (getDiscriminant() > 0) {
            double nghiem1 = ((-this.SoB) + Math.sqrt(getDiscriminant())) / (2 * this.SoA);
            System.out.println(" nghiệp 1 là " + nghiem1);
            double nghiem2 = ((-this.SoB) - Math.sqrt(getDiscriminant())) / (2 * this.SoA);
            System.out.println(" nghiệm 2 là " + nghiem2);
        } else if (getDiscriminant() == 0) {
            double nghiem = ((-this.SoB) + Math.sqrt(getDiscriminant())) / (2 * this.SoA);
            System.out.println("phuong trình có 2 nghiệm bằng nhau nghiệm là " + nghiem);
        } else {
            System.out.println(" phuong trình không có nghiệm");
        }
    }
}
