import java.util.Scanner;
class reverse_counting
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.");
		int num=input.nextInt();
		for(int counter=num;counter>=1;counter--){
			System.out.println(counter);
		}
	}
}