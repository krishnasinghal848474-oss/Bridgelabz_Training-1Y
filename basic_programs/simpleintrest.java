import java.util.Scanner;
class simpleintrest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the principle");
		int p=input.nextInt();
		System.out.println("enter the rate");
		int r=input.nextInt();
		System.out.println("enter the time");
		int t=input.nextInt();
		double simple=(p*r*t)/100;
		System.out.println("simple intrest is" +simple);
	}
}