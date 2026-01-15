import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first no");
		int a=input.nextInt();
		System.out.println("enter the Second no");
		int b=input.nextInt();
		System.out.println("enter the third no");
		int c=input.nextInt();
		int sum=a+b+c;
		double avg=sum/3;
		System.out.println("average" +avg);
	}
}