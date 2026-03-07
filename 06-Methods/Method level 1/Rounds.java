public class Rounds
{
	public void Rounds(double side1,double side2,double side3,double distance){
		double peri=side1+side2+side3;
		double totalround=distance/peri;
		System.out.println("total rounds are"+" "+totalround);
	}
	public static void main(String args[]){
		Rounds round=new Rounds();
		round.Rounds(5.0,2.0,1.0,5.0);
	}
}