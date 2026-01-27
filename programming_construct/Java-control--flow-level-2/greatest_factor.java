import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no=");
		int num=input.nextInt();
		int greatest_factor=1;
		for(int i=num-1;i==1;i--){
			if(num%i==0){
				greatest_factor=i;
				break;
			}
		}
		System.out.println(greatest_factor);
	}

}