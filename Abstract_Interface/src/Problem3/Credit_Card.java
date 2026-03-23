package Problem3;
public class Credit_Card implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

