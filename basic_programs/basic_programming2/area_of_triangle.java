import java.util.Scanner;
class area_of_triangle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the height");
		int h=input.nextInt();
		System.out.println("enter the base");
		int b=input.nextInt();
		double Area=(h*b)/2;
		System.out.println("area of triangle=" +Area);
	}
}