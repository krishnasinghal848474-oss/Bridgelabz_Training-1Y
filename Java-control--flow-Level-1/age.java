import java.util.Scanner;
class age
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the age");
		int age=input.nextInt();
		if(age>=18){
			System.out.println("you can vote");
		}
		else{
			System.out.println("you can not vote");
		}
	}
}