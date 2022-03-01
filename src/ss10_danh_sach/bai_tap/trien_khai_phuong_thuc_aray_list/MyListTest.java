package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_aray_list;

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
    }
    public static void main(String[] args) {
        MyList<Dog> dogs = new MyList<>();
        dogs.add(new Dog("Kitty"));
        dogs.add(new Dog("Small"));
        dogs.add(new Dog("Girl"));

        dogs.get(1);

        dogs.size();

        dogs.remove(2);
        dogs.indexOf(new Dog("Kitty"));

        dogs.contains(new Dog("Small"));

        dogs.add(3,new Dog("Sunny"));

        for (int i = 0; i < dogs.size(); i++) {
            if(dogs.get(i) != null){
                System.out.println(dogs.get(i).getName());

            }
        }
    }
}
