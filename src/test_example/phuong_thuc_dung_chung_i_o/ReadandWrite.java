package test_example.phuong_thuc_dung_chung_i_o;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWrite {
//    private static String CUSTOMER_FILE="src\\on_tap\\customer_manager\\data\\Customer.csv";

    // ghi file
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
//    public static void writeListCustomerToCSV(List<Customer> customerList,boolean append){
    //// chuyển đổi customerList => stringList;
//        List<String> stringList = new ArrayList<>();
//        for (Customer c: customerList) {
//            stringList.add(c.getInfoToCSV());
//        }
          //// gọi phương thức dùng chung để ghi file
//        writeListStringToCSV(CUSTOMER_FILE,stringList,append);
//    }






    // dọc file dùng chung
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

    // dọc ra 1 danh sách
//    public static List<Customer> readCustomerListFromCSV(){
//        List<Customer> customerList = new ArrayList<>();
//        // sử dụng phương thức dùng chung trả về một list dạng String
//        List<String> stringList = readListStringFromCSV(CUSTOMER_FILE);
//        String[] arr =null;
//        // Chuyển đổi list String về list Customer
//        for (String string: stringList) {
//            arr= string.split(",");
//            Customer customer = new Customer(Integer.parseInt(arr[0]),arr[1],arr[2]);
//            customerList.add(customer);
//        }
//        return customerList;
//    }

}
