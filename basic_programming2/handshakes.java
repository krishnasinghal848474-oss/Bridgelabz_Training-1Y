import java.util.Scanner;
class handshake
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=input.nextInt();
		int max_handshakes=(n*(n-1))/2;
		System.out.println("no of max handshake" +max_handshakes);
	}
}