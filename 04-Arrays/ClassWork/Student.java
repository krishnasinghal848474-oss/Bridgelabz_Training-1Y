public class Student{
	
	int age;
	int rollNo;
	String name;
	public void printinfo(){
		System.out.println("age:- "+age);
		System.out.println("rollNo:- "+rollNo);
		System.out.println("name:- "+name);
	}
	public static void main(String[] args){
		Student s1=new Student();
		int a=s1.age=12;
		int r=s1.rollNo=12;
		String n=s1.name="ram";
		s1.printinfo();
		System.out.println("--------------------------------------------");
	}
}