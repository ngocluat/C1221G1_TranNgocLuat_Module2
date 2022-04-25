package bai_tap.util;

import java.text.SimpleDateFormat;

public class RegexInput {
    public  static SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
    public static boolean regexMaBenAn(String maBenAn) {
        String regex = "^BA-\\d{3}$";
        return maBenAn.matches(regex);
    }
    public static boolean regexMaBenNhan(String MaBenNhan) {
        String regexVila = "^BN-\\d{3}$";
        return MaBenNhan.matches(regexVila);
    }
    public static boolean regexNgaySinh(String ngaySinh) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])[/\\-](0?[1-9]|1[012])[/\\-]\\d{4}$";
        return ngaySinh.matches(regex);
    }
    public static boolean regexName(String name) {
        String regexTenChuanHoa = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
        return name.matches(regexTenChuanHoa);
    }

}
