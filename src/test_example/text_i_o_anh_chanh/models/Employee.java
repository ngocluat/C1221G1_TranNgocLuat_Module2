package test_example.text_i_o_anh_chanh.models;

public class Employee  extends Person {
    protected int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String birthday, int salary) {
        super(id, name, birthday);
        this.salary = salary;
    }

    public void working(){
        System.out.println("nhân viên đang làm việc");
    }
}
