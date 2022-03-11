package test_example.bai_tap_lam_thu.utils;

import test_example.bai_tap_lam_thu.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {

  final  static String NAME_FILE = "src\\test_example\\bai_tap_lam_thu\\data\\product.txt";

    // docj file
    private static List<String> readListStringFromCSV(String pathFile) {
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


    public static List<Product> readListFromCSV(){
        List<Product> customerList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(NAME_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            Product products = new Product(Integer.parseInt(arr[0]),arr[1]);
            customerList.add(products);
        }
        return customerList;
    }





    //ghi file
    private static void writeListStringToCSV(String filePath, List<String> stringList, boolean append) {
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
    // ghi một list Customer cụ thể vào CSV
    public static void writeListToCSV(List<Product> customerList, boolean append){
    // chuyển đổi customerList => stringList;
        List<String> stringList = new ArrayList<>();
        for (Product c: customerList) {
            stringList.add(c.toStringProduct());
        }
    // gọi phương thức dùng chung để ghi file
        writeListStringToCSV(NAME_FILE,stringList,append);
    }

}
