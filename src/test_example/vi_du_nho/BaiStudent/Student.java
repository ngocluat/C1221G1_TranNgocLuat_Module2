package test_example.vi_du_nho.BaiStudent;

public class Student {
    private  int id;
    private  String name;
    private String className;
    static String school = " codeGym";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, String className, String school) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}

