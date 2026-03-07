public class Trigonometric
{
	public void Trigonometric_Function(double Angle){
		double radian=Angle*(Math.PI/180);
		System.out.println("Sine trigonometry func is"+" "+Math.sin(radian));
		System.out.println("Cosine trigonometry func is"+" "+Math.cos(radian));
		System.out.println("Tangent trigonometry func is"+" "+Math.tan(radian));
	}
	public static void main(String args[]){
		Trigonometric trigo=new Trigonometric();
		trigo.Trigonometric_Function(30);
		
	}
}