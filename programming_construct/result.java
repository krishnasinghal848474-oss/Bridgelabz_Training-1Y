import java.util.Scanner;
class Result
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=10;i++){
			int marks=input.nextInt();
			if (marks<50){
				System.out.println("fail");
			}
			else if (marks>=50 && marks<60){
				System.out.println("D garde");
			}
			else if (marks>=60 && marks<70){
				System.out.println("C grade");
			}
			else if (marks>=70 && marks<80){
				System.out.println("B grade");
			}
			else if (marks>=80 && marks<90){
				System.out.println("A grade");
			}
			else if (marks>=90 && marks<100){
				System.out.println("O Grade");
			}
		}
	}
}