package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInputName {



    public static boolean regexName(String name) {
        String regexTenChuanHoa = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
        return name.matches(regexTenChuanHoa);
    }
}
