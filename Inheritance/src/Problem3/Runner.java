package Problem3;

public class Runner {
    public static void main(String[] args) {
        Car c=new Car();
        c.maxspeed=40;
        c.Fueltype="Normal";
        c.Seatcapacity=4;

        Truck t=new Truck();
        t.maxspeed=80;
        t.Fueltype="Diesel";
        t.Seatcapacity_for_Truck=10;

        Motorbike m=new Motorbike();
        m.maxspeed=60;
        m.Fueltype="Normal";
        m.Seatcapacity_for_bike=2;
        c.Display_info();
        t.Display_info();
        m.Display_info();
    }
}
