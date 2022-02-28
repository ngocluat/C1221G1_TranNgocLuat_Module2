package test_example.vi_du_nho.EpKieu;

public class Maniii {
    public static void main(String[] args) {

        Emperty emperty = new Emperty();

//        worker1.= (Worker) new Pesson();cua();
        Pesson pesson;
        pesson = new Worker();

//        Worker worker = (Worker) new Pesson();
//        worker.NoiChuyen();

        ((Worker) pesson).NoiChuyen();

    }
}
