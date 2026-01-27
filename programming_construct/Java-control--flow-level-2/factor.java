import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no=");
		int num=input.nextInt();
		if(num>0){
			System.out.println("no is positive");
			for(int i=1;i<=num;i++){
				if(num%i==0){
				System.out.println(i);
				}
			}
		}
	}
}