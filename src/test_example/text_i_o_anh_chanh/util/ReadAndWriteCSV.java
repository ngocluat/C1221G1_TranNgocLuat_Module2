package test_example.text_i_o_anh_chanh.util;


import test_example.text_i_o_anh_chanh.models.Instructor;
import test_example.text_i_o_anh_chanh.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {

    static final String EMPLOYEE_FILE ="src\\test_example\\text_i_o\\data\\Instructor.csv";
    static final String STUDENT_FILE ="src\\test_example\\text_i_o\\data\\Student.csv";

    // anh không dùng nuữa
    public static void  writeStudentToCSV(Student student){
        File file = new File(STUDENT_FILE);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
           fileWriter = new FileWriter(file,true); // true ghi tiếp; false (mặc đinh): nghi đè
           bufferedWriter= new BufferedWriter(fileWriter);
           // ghi vào file csv
           bufferedWriter.write(student.getInfoToCSV());
           bufferedWriter.newLine();
           bufferedWriter.close();
           fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ghi một danh sách đối tượng vào csv
    public static void  writeStudentListToCSV(List<Student> studentList,Boolean append){

        File file = new File(STUDENT_FILE);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Student s: studentList) {
                bufferedWriter.write(s.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // cách 2
    public static void  writeStudentListToCSV2(List<Student> studentList,Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Student s : studentList) {
            stringList.add(s.getInfoToCSV());
        }
        writeStringListToCSV(stringList,STUDENT_FILE,append);

    }
    // ghi instructor
    public static void writeInstructorListToCSV(List<Instructor> instructorList, Boolean append){
           List<String> stringList = new ArrayList<>();
        for (Instructor i : instructorList) {
            stringList.add(i.getInfoToCSV());
        }
      writeStringListToCSV(stringList,EMPLOYEE_FILE,append);

    }
    // dùng để ghi chung các đối tượng
    private static void  writeStringListToCSV(List<String> stringList,String pathFile, Boolean append){

        File file = new File(pathFile);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String s: stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // dùng đọc
    public static List<Student> readStudentFromCSV(){
        List<Student> studentList = new ArrayList<>();
        File file = new File("src\\ss10_list\\manager_student\\data\\Student.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line=null;
            String[] arr=null;
             while ((line=bufferedReader.readLine())!=null){
                   arr = line.split(",");
                   Student student = new Student(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
                   studentList.add(student);
             }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return studentList;
    }
}
