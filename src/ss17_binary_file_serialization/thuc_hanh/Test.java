package ss17_binary_file_serialization.thuc_hanh;

import java.io.*;

public class Test {

        public static void main(String args[]) throws IOException {
            FileInputStream fin = null;
            try {
                fin = new FileInputStream("src\\text.txt");
                int i = 0;
                while ((i = fin.read()) != -1) {
                    System.err.print((char) i);
                }
                fin.close();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                fin.close();
            }
        }
    }
