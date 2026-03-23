package Problem3;

public class Car extends Vehicle{
    int Seatcapacity;
    public void Display_info(){
        System.out.println("Seat capacity of car is-"+Seatcapacity);
        System.out.println("Type of fuel for car is-"+Fueltype);
        System.out.println("Max speed of car is-"+maxspeed);
        System.out.println("                     ");
    }
}
