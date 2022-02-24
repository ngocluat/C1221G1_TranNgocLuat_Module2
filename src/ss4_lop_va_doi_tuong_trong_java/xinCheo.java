package ss4_lop_va_doi_tuong_trong_java;

class Counter2 {
//   static int a = 40;
//
//    /*non static*/
//    public static  void main(String args[]) {// hỏi cái static
//        System.out.println(a);
//    }

    int count = 0;//static

    /*se lay bo nho chi mot lan và giu lai gia tri cua no */
    /*ket qua thuc hien in ra 3 dong cac gia tri : 1,2,3 */
    Counter2() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}
//}
