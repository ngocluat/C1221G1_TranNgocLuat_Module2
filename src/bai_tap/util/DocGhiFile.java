package bai_tap.util;

import bai_tap.model.BenNhanVip;
import bai_tap.model.BenhNhan;
import bai_tap.model.BenhNhanThuong;
import bai_tap.services.IToString;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static final String NAME_FILE = "src\\bai_tap\\data\\benNhan.csv";


    public static <T> void writeListString(String filePath, List<T> list, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : list) {
                bufferedWriter.write(((IToString) t).toStringCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public static List<BenhNhan> readCostomerVNList1() {
        List<BenhNhan> benhNhanArrayList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            if (arr.length == 8){
                BenhNhanThuong benhNhanThuong = new BenhNhanThuong(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], Double.parseDouble(arr[7]));
                benhNhanArrayList.add(benhNhanThuong);
            } else if (arr.length == 4) {
                BenNhanVip costomerVN = new BenNhanVip(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                benhNhanArrayList.add(costomerVN);
            }
        }
        return benhNhanArrayList;
    }
}
