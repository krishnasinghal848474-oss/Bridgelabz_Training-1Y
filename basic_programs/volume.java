import java.util.Scanner;
class volume
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=input.nextInt();
		System.out.println("enter the height");
		int h=input.nextInt();
		System.out.println("enter the value of pi");
		double p=input.nextDouble();
		double volume=p*r*r*h;
		System.out.println("volume of cyclinder" +volume);
	}
}