package test_example.text_i_o_anh_chanh.models;

public class Student extends Person implements Comparable<Student> {
    private String className;
    static String school = "Codegym";


    public Student() {

    }

    public Student(int id, String name, String birthday, String className) {
        super(id, name, birthday);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void study(String subject) {
        System.out.println(this.name + " đang học môn " + subject);
    }

    public void study() {
        System.out.println("sinh viên đang học");
    }

    public void study(int point) {
        System.out.println("sinh viên đang học");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id =" + id +
                ",className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                "School=" + school +
                '}';
    }
    // phương  thức để lấy thông tin ghi vào csv
    //int id, String name, String birthday, String className
    public String getInfoToCSV(){
        return this.id +","+this.name+","+this.birthday+","+this.className;
    }

    @Override
    void goToBy() {
        System.out.println("đi lại bằng xe máy");
    }

    // dùng cho treeSet
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    // dùng cho Hashset và LinkedHashSet
    @Override
    public int hashCode() {
        return 123;
    }

    //// dùng cho Hashset và LinkedHashSet
    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.getId() == student.getId() && this.getName().equals(student.getName());
    }


}
