package lesson3;

public class Cat extends Animals{
    private static int catCounter = 0;

    public Cat() {
        catCounter++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кішка пробігла " + distance + " метрів");
        } else {
            System.out.println(" Кішка не може пробігти більше 200м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кішка не вміє плавати");
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
