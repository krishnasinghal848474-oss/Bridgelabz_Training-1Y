import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the temp in celcius");
		double cel=input.nextDouble();
		double far=(cel*9/5)+32;
		System.out.println("temp in farenhite=" +far);
	}
}
