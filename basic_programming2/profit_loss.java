import java.util.Scanner;
class profit_loss
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the cp");
		int cost_price=input.nextInt();
		System.out.println("enter the sp");
		int sell_price=input.nextInt();
		int profit=sell_price-cost_price;
		System.out.println("profit="+profit);
		double profit_per=(profit*100)/cost_price;
		System.out.println("profit%="+profit_per);
	}
}