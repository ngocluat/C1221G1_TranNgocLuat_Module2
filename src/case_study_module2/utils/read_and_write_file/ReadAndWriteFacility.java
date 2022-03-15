package case_study_module2.utils.read_and_write_file;

import case_study_module2.model.Employee;
import case_study_module2.model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFacility {

    final static String NAME_FILE_VILLA  = "src\\case_study_module2\\data\\VilaFile.csv";
    final static String NAME_FILE_ROOM  = "src\\case_study_module2\\data\\roomFile.csv";
    final static String NAME_FILE_HOUSE  = "src\\case_study_module2\\data\\HouseFile.csv";

//    private static List<String> readListString(String pathFile) {
//        List<String> stringList = new ArrayList<>();
//        File file = new File(pathFile);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                stringList.add(line);
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return stringList;
//    }


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


    public static void writeListVilla (List<Villa> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Villa c : employeeList) {
            stringList.add(c.toStringVilla());
        }
        writeListString(NAME_FILE_VILLA, stringList, append);
    }

}
