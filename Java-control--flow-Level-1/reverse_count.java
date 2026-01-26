import java.util.Scanner;
class reverse_counting
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=input.nextInt();
		System.out.println("Counting Starts");
		while(num>=0){
			System.out.println(num--);
		}
	}
}