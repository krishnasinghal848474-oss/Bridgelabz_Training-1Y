import java.util.Scanner;
class natural
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=input.nextInt();
		int sum=0;
		while(a>0){
			System.out.println("no is natural");
			sum=a*(a+1)/2;
		}
		System.out.println("sum is"+sum);
	}
}