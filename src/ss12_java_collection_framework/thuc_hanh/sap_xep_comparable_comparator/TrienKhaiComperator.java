package ss12_java_collection_framework.thuc_hanh.sap_xep_comparable_comparator;

import java.util.Comparator;

public class TrienKhaiComperator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
