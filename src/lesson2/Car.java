package lesson2;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("запускается электроника");
    }
    private void startCommand() {
        System.out.println("запускаются программы");
    }
    private void startFuelSystem() {
        System.out.println("запускается топливная стистема");
    }
}
