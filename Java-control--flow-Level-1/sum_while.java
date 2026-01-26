
import java.util.Scanner;
class num_sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,sum=0;
		System.out.print("enter a natural number: ");
		a = input.nextInt();
		int i =1;
		while(i<=a)
		{
			sum=i+sum;
			i++;
		}
		int sum2 = a*(a+1)/2;
		System.out.println("the sumwhile is: "+sum);
		System.out.println("the sum is: "+sum2);
		if (sum==sum2)
		{
			System.out.println("the result is correct");
		}
		else
		{
			System.out.println("the result is incorrect");
		}
	}
}
