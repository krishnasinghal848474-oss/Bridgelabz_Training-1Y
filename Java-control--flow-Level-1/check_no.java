import java.util.Scanner;
class check_no
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=input.nextInt();
		if(num>0){
			System.out.println("no is positive");
		}
		else if(num<0){
			System.out.println("no is negative");
		}
		else{
			System.out.println("no is zero");
		}
	}
}