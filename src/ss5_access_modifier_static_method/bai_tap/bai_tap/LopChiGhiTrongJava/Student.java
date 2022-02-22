package ss5_access_modifier_static_method.bai_tap.bai_tap.LopChiGhiTrongJava;

public class Student {
    public String name = "john";
    protected String classes = "CO2";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    Student() {

    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
