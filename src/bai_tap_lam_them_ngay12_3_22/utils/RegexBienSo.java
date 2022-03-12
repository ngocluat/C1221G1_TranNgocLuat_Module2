package bai_tap_lam_them_ngay12_3_22.utils;

public class RegexBienSo {

    //: XX-YZ-XXX.XX
    public static boolean kiemTraBienSoXeTai(String bienSo) {
        String regex = "^[0-9]{2}-[A-Z][0-9A-Z]-[0-9]{3}\\.[0-9]{2}$";
        return bienSo.matches(regex);
    }


    public static boolean kiemTraBienSoOTo(String bienSo) {
        String regex = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$";
        return bienSo.matches(regex);
    }

    public static boolean kiemTraBienXeMay(String bienSo) {
        String regex = "^[0-9]{2}[A-Z]\\w-[0-9]{3}\\.[0-9]{2}$";
        return bienSo.matches(regex);
    }
}
