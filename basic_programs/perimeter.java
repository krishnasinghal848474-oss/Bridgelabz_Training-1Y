import java.util.Scanner;
class perimeter
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length");
		int l=input.nextInt();
		System.out.println("enter the breadth");
		int b=input.nextInt();
		double peri=2*(l+b);
		System.out.println("perimeter=" +peri);
	}
}