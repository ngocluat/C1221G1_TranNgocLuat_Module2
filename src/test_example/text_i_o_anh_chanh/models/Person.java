package test_example.text_i_o_anh_chanh.models;

public class Person {
    protected int id;  // Global (biến toàn cụ, thuộc tính, biến instance)
    protected String name;
    protected String birthday;
    public Person(){
    }
    public Person(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
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
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

     void goToBy(){
        System.out.println("đi bộ");
    }
    // điểm danh, châm công.final nên lớp con không thể ghi đè method này
    public final void attendance(){
        System.out.println(" phương thức điểm danh, châm công");
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
