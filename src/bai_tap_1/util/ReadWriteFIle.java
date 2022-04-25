package bai_tap_1.util;


import bai_tap_1.models.CostomerNN;
import bai_tap_1.models.CostomerVN;
import bai_tap_1.models.Peson;
import bai_tap_1.models.ThongTinHoaDon;
import bai_tap_1.service.IFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFIle {
    private static final String NAME_FILE_COSTOMER = "src\\bai_tap_1\\data\\costomer.csv";
    private static final String NAME_FILE_HOA_DON = "src\\bai_tap_1\\data\\hoaDonKhachHang.csv";


    private static List<String> readListString(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Peson> readCostomer() {
        List<Peson> costomerVNArrayList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_COSTOMER);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            if (arr.length == 3) {

                CostomerNN costomerNN = new CostomerNN(Integer.parseInt(arr[0]), arr[1], arr[2]);// string
                costomerVNArrayList.add(costomerNN);
            } else if (arr.length == 4) {
                CostomerVN costomerVN = new CostomerVN(Integer.parseInt(arr[0]), arr[1], arr[2], Double.parseDouble(arr[3]));
                costomerVNArrayList.add(costomerVN);
            }
        }
        return costomerVNArrayList;
    }

    public static List<ThongTinHoaDon> readListThongTinHoaDon() {
        List<ThongTinHoaDon> thongTinHoaDons = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_HOA_DON);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            ThongTinHoaDon thongTinHoaDon = new ThongTinHoaDon(Integer.parseInt(arr[0]), arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]), Double.parseDouble(arr[5]));
            thongTinHoaDons.add(thongTinHoaDon);
        }
        return thongTinHoaDons;
    }

    public static <T> void writeListString(String filePath, List<T> list, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : list) {
                bufferedWriter.write(((IFileCSV) t).writeFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
