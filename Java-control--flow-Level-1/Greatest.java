import java.util.Scanner;
class Smallest
{
	public static void main(String agrs[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first no.");
		int a=input.nextInt();
		System.out.println("enter the Second no.");
		int b=input.nextInt();
		System.out.println("enter the third no.");
		int c=input.nextInt();
		if(a>b && a>c){
			System.out.println("Greatest no is"+a);
		}
		else if(b>a && b>c){
			System.out.println("Greatest no is"+b);
		}
		else if(c>a && c>b){
			System.out.println("Greatest no is"+c);
		}
	}
}