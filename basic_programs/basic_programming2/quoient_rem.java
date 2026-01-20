import java.util.Scanner;
class quotient_rem
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first no.");
		int a=input.nextInt();
		System.out.println("enter second no.");
		int b=input.nextInt();
		int rem=a%b;
		int que=a/b;
		System.out.println("rem="+rem);
		System.out.println("que="+que);
	}
}