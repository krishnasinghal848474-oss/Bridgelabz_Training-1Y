import java.util.Scanner;
class fees
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the fees");
		int fees=input.nextInt();
		System.out.println("enter the dis per");
		int d_p=input.nextInt();
		int d_a=fees/d_p;
		System.out.println("discounted fees if"+d_a);
		int d_f=fees-d_a;
		System.out.println("fees to pay"+d_f);
	}
}