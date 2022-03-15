package case_study_module2.utils.read_and_write_file;

import case_study_module2.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {


    final static String NAME_FILE = "src\\case_study_module2\\data\\employeeFile.csv";

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

    public static List<Employee> readList() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Long.parseLong(arr[8]));
            employeeList.add(employee);
        }
        return employeeList;
    }

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

    public static void writeList(List<Employee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee c : employeeList) {
            stringList.add(c.toStringPeson());
        }
        writeListString(NAME_FILE, stringList, append);
    }


}
