package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInputDienTich {

    public static boolean regexDienTich(String dienTich) {
        String regexDienTich = "^[3-9]([0-9]+)$";
        return dienTich.matches(regexDienTich);
    }

}
