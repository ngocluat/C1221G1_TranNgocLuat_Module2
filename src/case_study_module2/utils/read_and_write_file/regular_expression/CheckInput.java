package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInput {

    public static boolean regexDienTich(String dienTich) {
        String regexDienTich = "^[3-9]([0-9]+)$";
        return dienTich.matches(regexDienTich);
    }

    public static boolean regexName(String name) {
        String regexTenChuanHoa = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
        return name.matches(regexTenChuanHoa);
    }

    public static boolean regexNgaySinh(String ngaySinh) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])[/\\-](0?[1-9]|1[012])[/\\-]\\d{4}$";
        return ngaySinh.matches(regex);
    }

    public static boolean regexMaDichVuVilla(String maDichVu) {
        String regexVila = "^SVVL-\\d{4}$";
        return maDichVu.matches(regexVila);
    }

    public static boolean regexMaDichVuRoom(String maDichVu) {
        String regexVila = "^SVRO-\\d{4}$";
        return maDichVu.matches(regexVila);
    }

    public static boolean regexMaDichVuHouse(String maDichVu) {
        String regexVila = "^SVHO-\\d{4}$";
        return maDichVu.matches(regexVila);
    }

    public static boolean regexEmail(String email) {
        String regex = "\\S+@\\S+\\.\\S+";
        return email.matches(regex);
    }

}
