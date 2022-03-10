package ss17_binary_file_serialization.bai_tap.util;

import ss17_binary_file_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    final static String FILE = "D:\\codeGYM\\C1221G1-tr-n-lu-t\\C1221G1_[TranNgocLuat]_Module2\\src\\ss17_binary_file_serialization\\bai_tap\\data\\product.txt";


    // dọc
    public static List<Product> readTextFile() {
        File file = new File(FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Product> productList1 = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] listString = new String[5];
            while ((line = bufferedReader.readLine()) != null) {
                listString = line.split(",");
                productList1.add(new Product(Integer.parseInt(listString[0]), listString[1], listString[2], Double.parseDouble(listString[3]), listString[4]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList1;
    }

    // ghi
    public static void writeProductToText(List<Product> products,boolean append) {
        File file = new File(FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product:products                 ) {
                bufferedWriter.write(product.toStringProduct());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void timKiem() {
    }
}
