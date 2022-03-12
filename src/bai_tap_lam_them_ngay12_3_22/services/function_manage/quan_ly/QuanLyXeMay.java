package bai_tap_lam_them_ngay12_3_22.services.function_manage.quan_ly;

import bai_tap_lam_them_ngay12_3_22.model.MoTo;
import bai_tap_lam_them_ngay12_3_22.services.function_manage.IFunction;
import bai_tap_lam_them_ngay12_3_22.utils.RegexBienSo;
import bai_tap_lam_them_ngay12_3_22.utils.RegexHoVaTen;
import bai_tap_lam_them_ngay12_3_22.utils.read_and_write.ReadAndWriteXeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyXeMay implements IFunction {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void hienThi() {
        List<MoTo> moToList = ReadAndWriteXeMay.readList();
        for (int i = 0; i < moToList.size(); i++) {
            System.out.println((1 + i) + "." + moToList.get(i));
        }
    }

    @Override
    public void xoa() {
        List<MoTo> moToList = ReadAndWriteXeMay.readList();
        System.out.println(" nhập biển số bạn muốn  xóa ");
        String bienSodelete = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < moToList.size(); i++) {
            if (moToList.get(i).getLicensePlate().equals(bienSodelete)) {
                String yes= "YES";
                System.out.println(" bạn chắc chắn muốn xóa \n" +
                        "YES\n" +
                        "NO");
                String selectionDelete= scanner.nextLine();
                if (yes.equals(selectionDelete.toUpperCase())){
                    moToList.remove(moToList.get(i));
                    check= true;
                    break;
                }
            }else {
                check= false;
            }
        }
        if (!check){
            System.out.println(" không tìm thấy biển số xe ");
        }
        ReadAndWriteXeMay.writeList(moToList, false);
    }

    @Override
    public void them() {
        String bienSo;
        do {
            System.out.println("nhập biển kiểm xoát");
            bienSo = scanner.nextLine();
        } while (!RegexBienSo.kiemTraBienXeMay(bienSo));

        System.out.println(" nhập tên hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println(" nhập năm sản xuất ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        String chuSoHuu;
        do {
            System.out.println(" nhập chủ sỡ hữu ");
            chuSoHuu = scanner.nextLine();
        }while (!RegexHoVaTen.chuSoHuuXe(chuSoHuu));

        System.out.println(" nhập công xuất ");
        long congXuat = Long.parseLong(scanner.nextLine());
        MoTo moTo = new MoTo(bienSo, hangSanXuat, namSanXuat, chuSoHuu, congXuat);
        List<MoTo> moToList = new ArrayList<>();
        moToList.add(moTo);
        ReadAndWriteXeMay.writeList(moToList, true);
    }
}
