import java.util.Scanner;
class height_conv
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter your hieght in cm");
		double height=input.nextDouble();
		double height_inch=height/2.54;
		System.out.println("height in inch=" +height_inch);
		double height_foot=height*2.54*12;
		System.out.println("height in foot=" +height_foot);
	}
}