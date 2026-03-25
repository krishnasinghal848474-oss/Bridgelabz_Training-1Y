package Problem9;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        try {
            int element = arr[index];
            System.out.println("Element "+index+"is:"+element);
            try {
                int result = element / divisor;
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not Possible");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Array size is " + arr.length + ".");
        }

    }
}