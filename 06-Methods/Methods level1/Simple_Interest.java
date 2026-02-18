import java.util.Scanner;
public class Simple_Int
{
	public void Simple_Interest(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the principal");
		int principal=input.nextInt();
		System.out.println("enter the rate");
		int rate=input.nextInt();
		System.out.println("enter the time");
		int time=input.nextInt();
		int result=(principal*rate*time)/100;
		System.out.println("Simple intrest is"+" "+result);
	}
	public static void main(String args[]){
		Simple_Int si=new Simple_Int();
		si.Simple_Interest();
	}
}