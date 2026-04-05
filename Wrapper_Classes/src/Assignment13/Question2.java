package Assignment13;

public class Question2 {
    public void wrapperToPrimitive()
    {
        Double num1=45.21;
        double num2=45.78;
        int num3=(int) num2;
        System.out.println("Double: "+num1);
        System.out.println("double: "+num2);
        System.out.println("Type_Casted: "+num3);
    }

    public static void main(String[] args) {
        Question2 q2=new Question2();
        q2.wrapperToPrimitive();
    }
}
