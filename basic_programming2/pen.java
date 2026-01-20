import java.util.Scanner;
class pen
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter no.of pens");
		int pen=input.nextInt();
		System.out.println("enter no.of men");
		int men=input.nextInt();
		int rem=pen%men;
		int que=pen/men;
		System.out.println("rem="+rem);
		System.out.println("que="+que);
	}
}