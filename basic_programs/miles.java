import java.util.Scanner;
class miles
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("distance in kilometer");
		double dis=input.nextDouble();
		double miles=dis*0.621371;
		System.out.println("distance in miles="+miles);
	}
}