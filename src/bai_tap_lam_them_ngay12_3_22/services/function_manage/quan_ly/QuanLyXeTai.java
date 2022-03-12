package bai_tap_lam_them_ngay12_3_22.services.function_manage.quan_ly;

import bai_tap_lam_them_ngay12_3_22.model.Vans;
import bai_tap_lam_them_ngay12_3_22.services.function_manage.IFunction;
import bai_tap_lam_them_ngay12_3_22.utils.RegexBienSo;
import bai_tap_lam_them_ngay12_3_22.utils.RegexHoVaTen;
import bai_tap_lam_them_ngay12_3_22.utils.read_and_write.ReadAndWriteVans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyXeTai implements IFunction {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void hienThi() {
        List<Vans> vansList = ReadAndWriteVans.readList();
        for (int i = 0; i < vansList.size(); i++) {
            System.out.println((1 + i) + "." + vansList.get(i));
        }

    }

    @Override
    public void xoa() {
        List<Vans> vansList = ReadAndWriteVans.readList();
        System.out.println(" nhập biển số bạn muốn  xóa ");
        String bienSodelete = scanner.nextLine();
        boolean check= true;
        for (int i = 0; i < vansList.size(); i++) {
            if (vansList.get(i).getLicensePlate().equals(bienSodelete)) {
                String yes= "YES";
                System.out.println(" bạn chắc chắn muốn xóa \n" +
                        "YES\n" +
                        "NO");
                String selectionDelete= scanner.nextLine();
                if (yes.equals(selectionDelete.toUpperCase())){
                    vansList.remove(vansList.get(i));
                    check = true;
                    break;
                }
            }else {
                check= false;
            }
        }
        if (!check){
            System.out.println(" không tìm thấy biển số xe ");
        }
        ReadAndWriteVans.writeList(vansList, false);

    }

    @Override
    public void them() {
        String bienSo;
        do {
            System.out.println("nhập biển kiểm xoát");
            bienSo = scanner.nextLine();
        } while (!RegexBienSo.kiemTraBienSoXeTai(bienSo));
        System.out.println(" nhập tên hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println(" nhập năm sản xuất ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        String chuSoHuu;
        do {
            System.out.println(" nhập chủ sỡ hữu ");
            chuSoHuu = scanner.nextLine();
        } while (!RegexHoVaTen.chuSoHuuXe(chuSoHuu));

        System.out.println(" nhập trọng tải ");
        long trongTai = Long.parseLong(scanner.nextLine());

        Vans vans = new Vans(bienSo, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        List<Vans> vansList = new ArrayList<>();
        vansList.add(vans);
        ReadAndWriteVans.writeList(vansList, true);

    }
}
