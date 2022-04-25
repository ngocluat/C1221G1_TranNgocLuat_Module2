package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInput {

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
        String regex = "^\\S+@\\S+\\.\\S+$";
        return email.matches(regex);
    }
    public static boolean regexNgaySinhvip(String ngaySinh) {
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        return ngaySinh.matches(regex);
    }
    public static boolean regexSoHopDongMa(String ma) {
        String regex = "^[0]\\d{2,5}$";
        return ma.matches(regex);
    }
}
