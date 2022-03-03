package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_aray_list;

import java.util.HashSet;
import java.util.Objects;

public class MyListTest {
    public static class Dog{
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void talk(){
            System.out.println("Sủa sủa");
        }

        @Override
        public boolean equals(Object o) {
          Dog dog = (Dog) o;

           return dog.getName().equals(this.getName());

        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyList<Dog> dogs = new MyList<>();
        HashSet<Dog> dogHashSet  =  new HashSet<>();
        dogHashSet.add(new Dog("Kitty"));
        dogHashSet.add(new Dog("Small"));
        dogHashSet.add(new Dog("Kitty"));

        for (Dog dog:dogHashSet
             ) {
            System.out.println(dog);
        }
    }
}
