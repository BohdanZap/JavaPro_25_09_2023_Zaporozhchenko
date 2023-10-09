package lesson3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        dog.run(444);
        dog.swim(24);

        cat.run(40);
        cat.swim(100);

        System.out.println(Dog.getDogCounter());
        System.out.println(Cat.getCatCounter());
    }
}
