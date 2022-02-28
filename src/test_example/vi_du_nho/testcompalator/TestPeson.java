package test_example.vi_du_nho.testcompalator;

import java.util.Arrays;

public class TestPeson {
    public static void main(String[] args) {
        Peson peson = new Peson(" luạt ", 21);
        Peson peson1 = new Peson(" dluạt ", 19);
        Peson peson2 = new Peson(" aluạt ", 119);
        Peson peson3 = new Peson(" mluạt ", 1);
        Peson[] pesons = {peson, peson1, peson2, peson3};

        exc exc1 = new exc();
        Arrays.sort(pesons, exc1);
        for (Peson s : pesons) {
            System.out.println(s);
        }

        Vidu vidu = new Vidu();
        Arrays.sort(pesons,vidu);
        for (Peson a : pesons) {
            System.out.println(a);
        }

    }
}
