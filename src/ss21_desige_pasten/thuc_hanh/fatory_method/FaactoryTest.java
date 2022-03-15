package ss21_desige_pasten.thuc_hanh.fatory_method;

public class FaactoryTest {
    public static void main(String[] args) {


        AnimaFactory animalFactory = new AnimaFactory();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}