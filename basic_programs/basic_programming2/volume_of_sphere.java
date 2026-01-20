import java.util.Scanner;
class Volume_of_sphere
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the radius in km");
		int r=input.nextInt();
		System.out.println("enter the value of pi");
		double pi=input.nextDouble();
		double v=(4*pi*r*r*r)/3;
		double v_m=(4*pi*r*r*r*3963.105)/3;
		System.out.println("volume of earth in km"+v);
		System.out.println("volume of earth in miles"+v_m);

		
	}
}