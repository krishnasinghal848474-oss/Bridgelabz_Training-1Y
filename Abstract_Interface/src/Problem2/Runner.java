package Problem2;
public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new CAR();
        Vehicle v2 = new BIKE();
        Vehicle v3 = new BUS();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}

