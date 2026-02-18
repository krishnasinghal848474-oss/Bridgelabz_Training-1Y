import java.util.Scanner;
class pnz
{
	public void Positive_negative_zero(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no");
		int num=input.nextInt();
		if(num>0){
			System.out.println("no is positive");
		}
		if(num<0){
			System.out.println("no is negative");
		}
		if(num==0){
			System.out.println("no is zero");
		}
	}
	public static void main(String args[]){
		pnz n1=new pnz();
		n1.Positive_negative_zero();
	}
	
}