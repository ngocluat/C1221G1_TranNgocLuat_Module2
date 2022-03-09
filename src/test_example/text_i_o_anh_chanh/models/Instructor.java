package test_example.text_i_o_anh_chanh.models;

public class Instructor extends Employee {
    public Instructor(int salary) {
        super(salary);
    }

    public Instructor(int id, String name, String birthday, int salary) {
        super(id, name, birthday, salary);
    }

    public void teach(String subject){
        System.out.println("Giảng viên đang dạy môn "+ subject);
    }
    public String getInfoToCSV(){
        // thông tin chuỗi cách nhau dấu , theo thứ tự của constructor
        return "";
    }
}
