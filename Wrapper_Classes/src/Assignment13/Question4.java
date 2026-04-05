package Assignment13;

public class Question4 {
    public void check_Result(){
        Integer a=100;
        Integer b=100;
        Integer c=200;
        Integer d=200;
        System.out.println(a==b);
        System.out.println(c==d);
        boolean result=a.equals(b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Question4 q4=new Question4();
        q4.check_Result();
    }
}
