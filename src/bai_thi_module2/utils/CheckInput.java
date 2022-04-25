package bai_thi_module2.utils;

public class CheckInput {
    private static final String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*{4,50}$";
    private static final String NGAY_SINH = "^(0?[1-9]|[12][0-9]|3[01])[/\\-](0?[1-9]|1[012])[/\\-]\\d{4}$";
    private static final String NGAY_SINH_VIP = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String EMAIL_ADDRESS = "^\\w+([.-]?\\w+)*@[a-z]+\\.(\\w+){2,}(\\.\\w{2,3})?";
    private static final String  TELEPHONE_NUMBER = "^0\\d{9}$";

    public static boolean regexName(String name) { return name.matches(FULL_NAME_REGEX); }

    public static boolean regexNgaySinh(String ngaySinh) {
        return ngaySinh.matches(NGAY_SINH);
    }

    public static boolean regexNgaySinhvip(String ngaySinh) {
        return ngaySinh.matches(NGAY_SINH_VIP);
    }

    public static boolean regexEmail(String email) {
        return email.matches(EMAIL_ADDRESS);
    }

    public static boolean phone (String phone ) {
        return phone.matches(TELEPHONE_NUMBER);
    }


}
