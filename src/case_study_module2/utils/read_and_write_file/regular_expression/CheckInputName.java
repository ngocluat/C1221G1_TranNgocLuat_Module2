package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInputName {



    public static boolean regexName(String name) {
        String regexTenChuanHoa = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
        return name.matches(regexTenChuanHoa);
    }
    public static boolean regexNgaySinh(String ngaySinh ) {
       String regex="^(0?[1-9]|[12][0-9]|3[01])[/\\-](0?[1-9]|1[012])[/\\-]\\d{4}$";
        return ngaySinh.matches(regex);
    }
}
