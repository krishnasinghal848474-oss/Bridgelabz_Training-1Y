package Problem6;

public class Interest {
    static void calculateInterest(double amt,double rate,int years ) throws IllegalArgumentException{
        if(amt<0 ||rate<0){
            throw new IllegalArgumentException("amount and rate is invalid");
        }
        double interest=(amt*rate*years)/100;
        System.out.println("Interest is -"+"  "+interest);
    }
    public static void main(String[] args) {
        try{
            calculateInterest(-100,2.5,2);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
