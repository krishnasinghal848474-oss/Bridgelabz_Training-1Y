import java.util.Scanner;
class Smallest_Largest
{
	public void find_Smallest_largest(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first no");
		int num1=input.nextInt();
		System.out.println("enter the Second no");
		int num2=input.nextInt();
		System.out.println("enter the third no");
		int num3=input.nextInt();
		if(num1>num2&&num1>num3){
			System.out.println("num1 is greater");
		}
		if(num2>num1&&num2>num3){
			System.out.println("num2 is greater");
		}
		if(num3>num2&&num3>num1){
			System.out.println("num3 is greater");
		}
		if(num1<num2&&num1<num3){
			System.out.println("num1 is Smaller");
		}
				if(num2<num1&&num2<num3){
			System.out.println("num2 is Smaller");
		}
				if(num3<num1&&num3>num2){
			System.out.println("num3 is Smaller");
		}
	}
	public static void main(String args[]){
		Smallest_Largest s1=new Smallest_Largest();
		s1.find_Smallest_largest();
	}
}