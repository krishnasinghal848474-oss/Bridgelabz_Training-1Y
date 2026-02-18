import java.util.Scanner;
class Spring
{
	public void Check_Spring(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the month");
		int a=input.nextInt();
		System.out.println("enter the date");
		int b=input.nextInt();
		if((a==3 && b>=20) || (a==4) || (a==5) || (a==6 && b<=20 )){
			System.out.println("month is Spring");
		}
		else{
			System.out.println("month is not Spring");
		}
	}
	public static void main(String args[]){
		Spring s1=new Spring();
		s1.Check_Spring();
	}
}