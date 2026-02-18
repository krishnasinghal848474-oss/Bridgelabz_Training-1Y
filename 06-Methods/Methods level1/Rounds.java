import java.util.Scanner;
class Rounds
{
	public void Total_Rounds(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first side");
		int side1=input.nextInt();
		System.out.println("enter the Second side");
		int side2=input.nextInt();
		System.out.println("enter the Third side");
		int side3=input.nextInt();
		System.out.println("enter the Total distance");
		double dis=input.nextDouble();
		int peri=side1+side2+side3;
		double rounds=dis/peri;
		System.out.println("no of total rounds="+" "+rounds);
	}
	public static void main(String args[]){
		Rounds r1=new Rounds();
		r1.Total_Rounds();
	}
}