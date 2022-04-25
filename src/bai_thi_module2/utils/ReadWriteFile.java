package bai_thi_module2.utils;

import bai_thi_module2.model.GiaoVien;
import bai_thi_module2.model.SinhVien;
import bai_thi_module2.services.IToStringToCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    private static final String NAME_FILE = "src\\bai_thi_module2\\data\\students.csv";
    private static final String NAME_FILE_GIAO_VIEN = "src\\bai_thi_module2\\data\\giaoVien.csv";

    public static <T> void writeListString(String filePath, List<T> list, boolean append, String chek) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : list) {
                bufferedWriter.write(((IToStringToCSV) t).writeFileCSV());
                bufferedWriter.newLine();
            }
            System.out.println(chek);
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

    public static List<SinhVien> readListSinhVien() {
        List<SinhVien> sinhVienList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            SinhVien sinhVien = new SinhVien(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5]);
            sinhVienList.add(sinhVien);
        }
        return sinhVienList;
    }

    public static List<GiaoVien> readListGiaoVien() {
        List<GiaoVien> giaoVienArrayList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_GIAO_VIEN);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            GiaoVien giaoVien = new GiaoVien(arr[0], arr[1], arr[2],arr[3],arr[4]);
            giaoVienArrayList.add(giaoVien);
        }
        return giaoVienArrayList;
    }
}
