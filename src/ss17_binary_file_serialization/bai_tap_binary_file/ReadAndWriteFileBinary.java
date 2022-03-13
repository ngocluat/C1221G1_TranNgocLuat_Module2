package ss17_binary_file_serialization.bai_tap_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileBinary {

    final String FILE_PRODUCT = "src\\ss17_binary_file_serialization\\bai_tap_binary_file\\product.dat";

    public void writeFileBinary(List<Product> product) {
        File file = new File(FILE_PRODUCT);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(product);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public List<Product> readFileBinary() {
        List<Product> products = new ArrayList<>();
        File file = new File(FILE_PRODUCT);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                products = (List<Product>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    objectInputStream.close();
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return products;
    }

}
