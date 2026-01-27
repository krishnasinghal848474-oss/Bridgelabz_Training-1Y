import java.util.Scanner;
class fizz_buzz
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no=");
		int num=input.nextInt();
		if(num>0){
			System.out.println("no is positive");
			for(int i=1;i<=num;i++){
				if(i%3==0 && i%5==0){
					System.out.println("fizz_buzz");
				}
				else if(i%3==0){
					System.out.println("fizz");
				}
				else if(i%5==0){
					System.out.println("buzz");
				}
				else{
					System.out.println(i);
				}
			}
		}
	}
}