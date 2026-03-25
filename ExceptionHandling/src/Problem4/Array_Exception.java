package Problem4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Array_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();  // may throw InputMismatchException
            }

            System.out.println("enter the index");
            int x = sc.nextInt();

            System.out.println("value at index"+" " +x +" "+"is"+" " + arr[x]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
        }
        catch (NullPointerException e) {
            System.out.println("Array is Empty");

        }
        finally {
            System.out.println("code Executed");
        }
        }
    }


