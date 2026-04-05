package Assignment13;

public class Question5 {
    public void methods_Result(){
        String num1="123";
        int string_number=Integer.parseInt(num1);
        System.out.println(string_number);
        System.out.println("             ");
        String num2="3.14";
        double string_double=Double.parseDouble(num2);
        System.out.println(string_double);
        System.out.println("             ");
        String num3="true";
        boolean string_boolean=Boolean.parseBoolean(num3);
        System.out.println(string_boolean);
        System.out.println("              ");
        int num4=4;
        String integer_String=Integer.toBinaryString(num4);
        System.out.println(integer_String);
        System.out.println("              ");
        char string5='5';
        boolean check_number=Character.isDigit(string5);
        System.out.println(check_number);
        System.out.println("             ");
        char string2='a';
        char to_uppercase=Character.toUpperCase(string2);
        System.out.println(to_uppercase);
    }

    public static void main(String[] args) {
        Question5 q5=new Question5();
        q5.methods_Result();
    }
}
