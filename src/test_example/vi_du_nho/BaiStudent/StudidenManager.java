package test_example.vi_du_nho.BaiStudent;

import java.util.ArrayList;
import java.util.List;

public class StudidenManager {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "luật", " 1221G1", "C12"));
        students.add(new Student(1, "luật", " 1221G1", "1"));
        students.add(new Student(1, "111", " uaw", "C12"));

    }

    public static void showlistStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));


        }

    }



    public void edit() {

    }
}
