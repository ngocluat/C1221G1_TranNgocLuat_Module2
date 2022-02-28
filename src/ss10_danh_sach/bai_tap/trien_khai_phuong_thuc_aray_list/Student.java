package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_aray_list;

public class Student {
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student(1, " luật");
        Student student1 = new Student(2, " llinh");
        Student student2 = new Student(4, " alo");
        Student student3 = new Student(5, " abs ");
        Student student4 = new Student(9, "1123456");


        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student);
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student4);
        studentMyList.add(student3);

        for (int i = 0; i < studentMyList.size(); i++) {
            Student students =(Student) studentMyList.element[i];
            System.out.println(students.getId());
            System.out.println(students.getName());
        }

    }

}
