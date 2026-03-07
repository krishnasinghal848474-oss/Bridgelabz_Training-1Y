public class Windchill_temperature
{
	public void windchill(double temp,double windspeed){
		double windchill=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(windspeed,0.16);
		System.out.println("windchill temperature is"+" "+windchill);
	}
	public static void main(String args[]){
		Windchill_temperature wc= new Windchill_temperature();
		wc.windchill(27,115);
	}
}