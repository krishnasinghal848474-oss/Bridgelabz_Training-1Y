import java.util.Scanner;
class even_odd_upto_limit
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the last no");
		int num=input.nextInt();
		for(int i=1;i<=num;i++){
			if(i%2==0){
			System.out.println("the even no. are");
			System.out.println(i);
			}
			else{
				System.out.println("the odd no are ");
				System.out.println(i);
			}
		}
	}
}