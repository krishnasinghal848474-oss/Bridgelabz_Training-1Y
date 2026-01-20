import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" enter your first no");
		int a=input.nextInt();
		System.out.println(" enter your second no");
		int b=input.nextInt();
		int sum=a+b;
		System.out.println("Addition of two no=" +sum);
	}
}
