package case_study_module2.utils.read_and_write_file.regular_expression;

public class CheckInputServiceCode {
    public static boolean regexMaDichVuVilla(String maDichVu) {
        String regexVila = "^[SV][VL]-\\d{4}$";
        return maDichVu.matches(regexVila);
    }


    public static boolean regexMaDichVuRoom(String maDichVu) {
        String regexVila = "^[SV][RO]-\\d{4}$";
        return maDichVu.matches(regexVila);
    }

    public static boolean regexMaDichVuHouse(String maDichVu) {
        String regexVila = "^[SV][HO]-\\d{4}$";
        return maDichVu.matches(regexVila);
    }


}