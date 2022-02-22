package ss5_access_modifier_static_method.bai_tap.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car() {

    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car car11 = new Car("Mazda 3", "Skyactiv 3");
        Car car22 = new Car("Mazda 6", "Skyactiv 6");
        Car car = new Car("ma","a");

        System.out.println(Car.numberOfCars);
    }
}
