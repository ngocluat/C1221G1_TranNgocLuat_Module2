package test_example.vi_du_nho.testcompalator;

import java.util.Comparator;

public class Peson{
    String name ;
    int tuoi;

    public Peson() {
    }

    public Peson(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

}
