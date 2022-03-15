package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInputName {



    public static boolean regexNameServiice(String tenDichVu) {
        String regexTenDichVu = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
        return tenDichVu.matches(regexTenDichVu);
    }
}
