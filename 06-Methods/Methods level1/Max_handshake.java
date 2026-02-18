import java.util.Scanner;
class Max_handshake
{
	public void Maximum_Handshake(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no of students");
		int stu=input.nextInt();
		int handshakes=(stu*(stu-1))/2;
		System.out.println("Max handshakes are"+" "+handshakes);
	}
	public static void main(String args[]){
		Max_handshake m1=new Max_handshake();
		m1.Maximum_Handshake();
	}
}