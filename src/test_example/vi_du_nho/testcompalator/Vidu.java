package test_example.vi_du_nho.testcompalator;

import java.util.Comparator;

public class Vidu implements Comparator<Peson> {
    @Override
    public int compare(Peson o1, Peson o2) {
        return o1.getTuoi() - o2.getTuoi();
    }
}
