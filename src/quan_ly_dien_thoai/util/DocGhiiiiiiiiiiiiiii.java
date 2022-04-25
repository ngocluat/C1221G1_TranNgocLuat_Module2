package quan_ly_dien_thoai.util;

import quan_ly_dien_thoai.model.DienThoai;
import quan_ly_dien_thoai.model.DienThoaiChinhHang;
import quan_ly_dien_thoai.model.DienThoaiXachTay;
import quan_ly_dien_thoai.service.IGhiFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiiiiiiiiiiiiiii {
    private static final String NAME_FILE = "src\\quan_ly_dien_thoai\\data\\dienThoaiChinhHang.csv";
//    private static final String NAME_FILE_CHINH_HANG = "src\\quan_ly_dien_thoai\\data\\dienThoaiChinhHang.csv";

    // ghi file chung
    public static <T> void writeListString(String filePath, List<T> list, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : list) {
                bufferedWriter.write(((IGhiFile) t).toStringFile());
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


    //arr[0], arr[1], arr[2],arr[3],arr[4], arr[5], arr[6], arr[7],arr[8]
    public static List<DienThoai> readListDienThoaiChinhHang() {
        List<DienThoai> dienThoaiChinhHangList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            if (((Object)arr[5]).getClass().getSimpleName().toLowerCase().equals("integer")) {
                    DienThoaiChinhHang thoaiChinhHang = new DienThoaiChinhHang(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]), arr[4], Integer.parseInt(arr[5]), arr[6]);
                    dienThoaiChinhHangList.add(thoaiChinhHang);
                } else {
                    DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]), arr[4], arr[5], arr[6]);
                dienThoaiChinhHangList.add(dienThoaiXachTay);
            }
        }
        return dienThoaiChinhHangList;
    }

}
