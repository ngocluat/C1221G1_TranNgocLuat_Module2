package test_example.vi_du_nho.testcompalator;

public class peson {
    String name ;
    int tuoi;

    public peson() {
    }

    public peson(String name, int tuoi) {
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
        return "peson{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
