public class Quotient_Reminder
{
	public void QuotientAndReminder(int num1,int num2){
		System.out.println("Reminder is"+" "+num1%num2);
		System.out.println("Quotient is"+" "+num1/num2);
	}
	public static void main(String args[]){
		Quotient_Reminder QR = new  Quotient_Reminder();
		QR.QuotientAndReminder(5,2);
	}
}