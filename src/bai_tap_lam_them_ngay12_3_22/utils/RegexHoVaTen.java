package bai_tap_lam_them_ngay12_3_22.utils;

public class RegexHoVaTen {

    public static boolean chuSoHuuXe(String hoVaTen) {
                      //^([A-Z][a-z]+)(\s[A-Z][a-z]+)*$
        String regex = "^([A-Z][a-z]+)\\s([A-Z][a-z]+)*$";
                      //^[A-Z](a-z]{+})\\s[A-Z]([a-z]{+})$
        return hoVaTen.matches(regex);
    }
}
