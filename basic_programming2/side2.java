import java.util.Scanner;
class side
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the perimeter of square");
		int peri=input.nextInt();	
		double side=peri/4;
		System.out.println("side is=" +side);
	}
}