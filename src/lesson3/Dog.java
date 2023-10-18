package lesson3;

public class Dog extends Animals{

    private static int dogCounter = 0;

    public Dog() {
        dogCounter++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробігла " + distance + " метрів");
        } else {
            System.out.println("Собака не може пробігти більше 500м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака пропливла " + distance + " метрів");
        } else {
            System.out.println("Собака не може проплисти більше 10м");
        }
    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
