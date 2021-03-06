package bai_tap_lam_them_ngay12_3_22.utils.read_and_write;

import bai_tap_lam_them_ngay12_3_22.model.OTo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteOTo {
    final static String NAME_FILE = "src\\bai_tap_lam_them_ngay12_3_22\\data\\oto.txt";

    // docj file
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


    public static List<OTo> readList() {
        List<OTo> customerList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            //(String licensePlate, String producer, int yearOfManufacture, String owner, int seat, String carType
            OTo oTos = new OTo(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]);
            customerList.add(oTos);
        }
        return customerList;
    }


    //ghi file
    private static void writeListString(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeList(List<OTo> vansList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (OTo c : vansList) {
            stringList.add(c.toStringOTo());
        }
        writeListString(NAME_FILE, stringList, append);
    }

}
