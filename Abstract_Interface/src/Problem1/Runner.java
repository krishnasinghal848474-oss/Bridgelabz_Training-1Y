package Problem1;
public class Runner
{
    public static void main(String[] args)
    {
        Smart_Device d1 = new Light();
        Smart_Device d2 = new AC();
        Smart_Device d3 = new TV();

        d1.turnOn();
        d2.turnOn();
        d3.turnOn();

        d1.turnOff();
        d2.turnOff();
        d3.turnOff();
    }
}
