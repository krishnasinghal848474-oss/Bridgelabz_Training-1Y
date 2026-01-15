import java.util.Scanner;
class bill
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the total item");
		int item=input.nextInt();
		System.out.println("enter the price of one item");
		int unit_price=input.nextInt();
		int bill = item*unit_price;
		System.out.println("total bill is of=" +bill);
	}
}