import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter math marks");
		int math=input.nextInt();
		System.out.println("enter phy marks");
		int phy=input.nextInt();
		System.out.println("enter chem marks");
		int chem=input.nextInt();
		int sum=math+phy+chem;
		double avg=sum/3;
		System.out.println("avg="+avg);

	}
}