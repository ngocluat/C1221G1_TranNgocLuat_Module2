package ss16_i_o_text_file.bai_tap.copy_file;

import java.io.*;

public class Test {
    public static void docFile() {
        try {
            File file = new File("src\\ss16_i_o_text_file\\bai_tap\\copy_file\\sourcefile");
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
            bufferedWriter.write(String.valueOf(new File("src\\ss16_i_o_text_file\\bai_tap\\copy_file\\sourcefile")));
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test.ghiFile("src\\ss16_i_o_text_file\\bai_tap\\copy_file\\sourcefile.txt");
        Test.docFile();
        Test.ghiFile("src\\ss16_i_o_text_file\\bai_tap\\copy_file\\targetfile.txt");
        Test.docFile();
    }
}
