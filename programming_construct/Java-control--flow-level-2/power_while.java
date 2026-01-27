import java.util.*;
class power_while
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("enter a number: ");
		a= input.nextInt();
		if (a>0){
			System.out.println("positive number");
		}
		else {
			System.out.println("not positive");
		}
		System.out.print("enter a power: ");
		b= input.nextInt();
		int num =1 ;
		int i =1;
		while(i<=b){
			i++;
			num*=a;
		}
		System.out.println("the power of result is: "+num);
	}
}