package ss16_i_o_text_file.bai_tap.copy_file;

import java.io.*;

public class Test {
    public static void docFile(String source) {
        try {
            File file = new File(source);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                System.err.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void ghiFile(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test.docFile("src\\ss16_i_o_text_file\\bai_tap\\copy_file\\source file");
        Test.ghiFile("src\\ss16_i_o_text_file\\bai_tap\\copy_file\\target file");

    }
}
