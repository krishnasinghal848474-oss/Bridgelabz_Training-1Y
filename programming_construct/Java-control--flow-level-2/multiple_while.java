import java.util.Scanner;
class factor
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no=");
		int num=input.nextInt();
		int i=1;
		while(i<num){
			if(i%num==0){
				System.out.println(i);
			}
			i++;
		}
	}
}

