package Problem1;

public class TV implements Smart_Device {
    @Override
    public void turnOn() {
        System.out.println("TV is  ON");
    }
    @Override
    public void turnOff() {
        System.out.println("TV is  OFF");
    }
}

