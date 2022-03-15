package ss21_desige_pasten.thuc_hanh.fatory_method;

public class AnimaFactory {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}