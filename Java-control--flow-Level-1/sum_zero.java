import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
        double total = 0.0;
		double num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to sum (enter 0 to stop):");
		num=input.nextDouble();
		while(num!=0){
			total+=num;
			System.out.println("enter the another value");
			num=input.nextDouble();
		}
		System.out.println(total);
    }
}