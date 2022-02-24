package test_example.vi_du_nho.BaiStudent;

public class StudidenManager {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "luật", " 1221G1", "C12");
        students[1] = new Student(2, "loa", " 1221G1", "C12");
        students[2] = new Student(3, "linh", " 1221G1", "C12");
    }

    public static void showlistStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            } else {

            }
        }

    }

    public void add(int id, String name, String className, String school) {
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                System.out.println(students[index+1].toString());
                break;
            }
        }

    }

    public void edit() {

    }
}
