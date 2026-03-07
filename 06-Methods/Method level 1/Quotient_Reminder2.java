public class Quotient_Reminder2
{
	public void QuotientAndReminder(int num,int divisior){
		System.out.println("each Student will get"+" "+num/divisior+"chocolates");
		System.out.println("Remaining chocolates are"+" "+num%divisior);
	}
	public static void main(String args[]){
		Quotient_Reminder2 QR = new  Quotient_Reminder2();
		QR.QuotientAndReminder(50,20);
	}
}