package test_example.baitihi;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ChuanBiControllers {

    static Scanner scanner = new Scanner(System.in);
    private static boolean flag= true;
    // hàm dùng
    public  static  void management(){
        do {
            System.out.println("nhập ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    flag =false;
                    break;
                default:
                    System.out.println(" nhập sai ");
            }
        }while (flag);
    }

}
