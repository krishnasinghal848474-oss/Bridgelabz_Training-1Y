package Problem1;

public class Light implements Smart_Device {
    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }
    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
