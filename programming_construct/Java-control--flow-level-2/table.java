import java.util.Scanner;
class table
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(i*num);
		}
	}
}