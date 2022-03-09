package test_example.text_i_o_anh_chanh.services.impl;


import test_example.text_i_o_anh_chanh.models.Student;
import test_example.text_i_o_anh_chanh.services.IStudentService;
import test_example.text_i_o_anh_chanh.util.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    private static LinkedList<Student> peopleList = new LinkedList<>();  // sử dùng biến static
    static {
        peopleList.add(new Student(1,"Chanh","12-12","C12"));
        peopleList.add(new Student(2,"Chanh2","12-12","C12"));
        peopleList.add( new Student(3,"Chanh3","12-12","C12"));
        peopleList.add( new Student(4,"Chanh4","12-12","C12"));
    }
    // hiện thị danh sách
    public void display(){
        List<Student> studentList = ReadAndWriteCSV.readStudentFromCSV();
        for (int i=0;i<studentList.size();i++) {
            System.out.println((1+i)+"."+studentList.get(i));
        }
    }
    // thêm mói
    public void add(){
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập ten");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String birthday = scanner.nextLine();
        System.out.println("nhập lớp");
        String className = scanner.nextLine();
        Student student = new Student(id,name,birthday,className);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        // ghi vào file gọi function stact của class
//        ReadAndWriteCSV.writeStudentToCSV(student);
        ReadAndWriteCSV.writeStudentListToCSV2(studentList,true);
    }
    public void edit(){
        List<Student> studentList = ReadAndWriteCSV.readStudentFromCSV();
        display();
        System.out.println("chọn sinh viên cần sửa");
        int choose = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập id mơi");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập ten moi");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh moi");
        String birthday = scanner.nextLine();
        System.out.println("nhập lớp moi");
        String className = scanner.nextLine();
        studentList.get(choose-1).setId(id);
        studentList.get(choose-1).setName(name);
        studentList.get(choose-1).setBirthday(birthday);
        studentList.get(choose-1).setClassName(className);
        // code chỉnh sửa
        ReadAndWriteCSV.writeStudentListToCSV(studentList,false);
    }
    public void delete(){
        List<Student> studentList = ReadAndWriteCSV.readStudentFromCSV();
        display();
        System.out.println("chọn sinh viên muốn xóa");
        int choose = Integer.parseInt(scanner.nextLine());
        studentList.remove(choose-1);
        ReadAndWriteCSV.writeStudentListToCSV(studentList,false);
    }
}
