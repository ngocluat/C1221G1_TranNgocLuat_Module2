package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());


        System.out.println(" \n" +
                "sum the 2 numbers you enter");
        System.out.println(" nhập số 1 ");
        double soThuNhat = scanner.nextDouble();
        System.out.println(" nhập số 2 ");
        double soThuHai = scanner.nextDouble();
        tinhTong tinhTong = new tinhTong(soThuNhat, soThuHai);
        System.out.println(" tổng 2 số là  ");
        System.out.print(tinhTong.tong());

    }
}

class Rectangle {

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

class tinhTong {
    double so1, so2;

    tinhTong(double so1, double so2) {
        this.so1 = so1;
        this.so2 = so2;
    }

    double getSo1() {
        return so1;
    }

    double getSo2() {
        return so2;
    }

    public double tong() {
        double tong = getSo1() + getSo2();
        return tong;
    }
}