import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base in cm: ");
        double base_cm = scanner.nextDouble();
        System.out.print("Enter the height in cm: ");
        double height_cm = scanner.nextDouble();
        double area_sq_cm = 0.5 * base_cm * height_cm;
        double cm_to_inch_conversion = 2.54 * 2.54;
        double area_sq_in = area_sq_cm / cm_to_inch_conversion;
        System.out.println("The Area of the triangle in sq in is " + area_sq_in );
		System.out.println("The Area of the triangle in sq cm is " + area_sq_cm);

        scanner.close();
    }
}