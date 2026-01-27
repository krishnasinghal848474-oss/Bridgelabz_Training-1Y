import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no=");
		int num=input.nextInt();
		if(num>0 && num<100){
			for(int i=100;i>=1;i--){
				if(i%num==0){
					System.out.println(i);
				}
			}
		}
	}
}