import java.util.Scanner;
class age_height
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the age of amar");
		System.out.println("enter the age of akbar");
		System.out.println("enter the age of anthony");
		System.out.println("enter the height of amar");
		System.out.println("enter the height of akbar");
		System.out.println("enter the height of anthony");
		int age1=input.nextInt();
		int age2=input.nextInt();
		int age3=input.nextInt();
		int height1=input.nextInt();
		int height2=input.nextInt();
		int height3=input.nextInt();
		if(age1<age2 && age1<age3){
			System.out.println("amar is younger");
		}
		if(age2<age1 && age2<age1){
			System.out.println("akbar is younger");
		}
		if(age3<age1 && age3<age2){
			System.out.println("anthony is younger");
		}
		if(height1>height2 && height1>height3){
			System.out.println("amar is taller");
		}
		if(height2>height1 && height2>height3){
			System.out.println("akbar is taller");
		}
		if(height3>height1 && height3>height2){
			System.out.println("anthonyis taller");
		}
		
	}
}