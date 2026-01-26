import java.util.Scanner;
class divisible
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enetr the no. to check");
	int i=input.nextInt();
	if(i%5==0)
	{
		System.out.println("no.is divisible by 5");
	}
	else{
		System.out.println("no is not divisible by 5");
	}
	}
}