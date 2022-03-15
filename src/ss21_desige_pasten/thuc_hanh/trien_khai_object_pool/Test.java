package ss21_desige_pasten.thuc_hanh.trien_khai_object_pool;

public class Test {
    public static final int NUM_OF_CLIENT = 10;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 1; i < NUM_OF_CLIENT; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();

        }
    }
}
