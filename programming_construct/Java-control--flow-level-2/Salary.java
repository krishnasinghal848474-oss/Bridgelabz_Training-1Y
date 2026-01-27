import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter the salary");
		int a=input.nextInt();
		System.out.println("enter the time");
		int b=input.nextInt();
		int bonus;
		if(b>5){
			bonus=(5*a)/100;
			System.out.println("the bonus is"+bonus);
		}
		else{
			System.out.println("there is no bonus");
		}
	}
}