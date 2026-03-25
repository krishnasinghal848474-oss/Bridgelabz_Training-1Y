package Problem7;
import java.util.Scanner;
public class Finally_Block {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter the first no-");
            int num1=sc.nextInt();
            System.out.println("enter the second no-");
            int num2=sc.nextInt();
            int result=num1/num2;
            System.out.println("result is"+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by Zero is not possible");
        }
        finally {
            System.out.println("Operation Completed");
        }
    }
}
