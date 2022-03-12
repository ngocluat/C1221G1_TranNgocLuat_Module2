package bai_tap_lam_them_ngay12_3_22.services.function_manage.quan_ly;

import bai_tap_lam_them_ngay12_3_22.model.OTo;
import bai_tap_lam_them_ngay12_3_22.services.function_manage.IFunction;
import bai_tap_lam_them_ngay12_3_22.utils.RegexBienSo;
import bai_tap_lam_them_ngay12_3_22.utils.RegexHoVaTen;
import bai_tap_lam_them_ngay12_3_22.utils.read_and_write.ReadAndWriteOTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyXeOTo implements IFunction {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void hienThi() {
        List<OTo> oToList = ReadAndWriteOTo.readList();
        for (int i = 0; i < oToList.size(); i++) {
            System.out.println((1 + i) + "." + oToList.get(i));
        }
    }

    @Override
    public void xoa() {
        List<OTo> oToList = ReadAndWriteOTo.readList();
        System.out.println(" nhập biển số bạn muốn  xóa ");
        String bienSodelete = scanner.nextLine();
        boolean check= true;
        for (int i = 0; i < oToList.size(); i++) {
            if (oToList.get(i).getLicensePlate().equals(bienSodelete)) {
                String yes= "YES";
                System.out.println(" bạn chắc chắn muốn xóa \n" +
                        "YES\n" +
                        "NO");
                String selectionDelete= scanner.nextLine();
                if (yes.equals(selectionDelete.toUpperCase())){
                    oToList.remove(oToList.get(i));
                    check= true;
                }
            }else {
                check= false;
            }
        }
        if (!check){
            System.out.println(" không tìm thấy biển số xe ");
        }
        ReadAndWriteOTo.writeList(oToList, false);
    }

    @Override
    public void them() {

        String bienSo;
        do {
            System.out.println("nhập biển kiểm xoát");
            bienSo = scanner.nextLine();
        } while (!RegexBienSo.kiemTraBienSoOTo(bienSo));
        System.out.println(" nhập tên hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println(" nhập năm sản xuất ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        String chuSoHuu;
        do {
            System.out.println(" nhập chủ sỡ hữu ");
            chuSoHuu = scanner.nextLine();
        }while (!RegexHoVaTen.chuSoHuuXe(chuSoHuu));

        System.out.println(" nhập cổ ngồi ");
        int choNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập loại xe ");
        String loaiXe = scanner.nextLine();

        OTo oTo = new OTo(bienSo, hangSanXuat, namSanXuat, chuSoHuu, choNgoi, loaiXe);
        List<OTo> oToList = new ArrayList<>();
        oToList.add(oTo);
        ReadAndWriteOTo.writeList(oToList, true);
    }
}
