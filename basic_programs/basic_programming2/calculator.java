import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first no=");
		int num1=input.nextInt();
		System.out.println("enter the second no=");
		int num2=input.nextInt();
		int add=num1+num2;
		int multi=num1*num2;
		double div=num1/num2;
		int sub=num1-num2;
		System.out.println("Addition is=" + add);
		System.out.println("Subtraction is=" + sub);
		System.out.println("multiplication is=" + multi);
		System.out.println("division is=" + div);
	}
}