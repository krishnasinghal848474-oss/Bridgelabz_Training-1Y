import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the birth year");
		int birth_year=input.nextInt();
		int Current_year=2026;
		int age=Current_year-birth_year;
		System.out.println("age="+age);
	}
}