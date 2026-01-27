import java.util.*;
class Gratest_factor_while
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a;
		System.out.print("enter a number: ");
		a=input.nextInt();
		int result=1;
		int i=a-1;
		while(i>=1)
		{
			i--;
			if(a%i==0)
			{
				result=i;
				break;
			}
		}
		System.out.println("the greatest factor is: "+result);
		
	}
