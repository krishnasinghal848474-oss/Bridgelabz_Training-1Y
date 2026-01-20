import java.util.Scanner;
class area
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the radius=");
		int r=input.nextInt();
		System.out.println("enter the value of pi");
		double p=input.nextDouble();
		double area=p*r*r;
		System.out.println("area of circle=" +area);
	}
}