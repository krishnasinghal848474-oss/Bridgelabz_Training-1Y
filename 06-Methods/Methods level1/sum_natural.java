import java.util.Scanner;
class sum_natural
{
	public void sum_Natural(){
		Scanner input =new Scanner(System.in);
		System.out.println("enter the last no");
		int num=input.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println("sum of natural no is"+" "+sum);
	}
	public static void main(String args[]){
		sum_natural n1=new sum_natural();
		n1.sum_Natural();
	}
}