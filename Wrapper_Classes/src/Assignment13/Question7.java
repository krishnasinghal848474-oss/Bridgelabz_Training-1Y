package Assignment13;

import java.util.ArrayList;

public class Question7 {
    public void arraytoArraylist(){
        double prices[]={10.5, 20.0, 35.75, 5.5};
        double sum=0;
        double max=prices[0];
        ArrayList<Double> list1 = new ArrayList<>();
        for(int i=0;i<prices.length;i++) {
            list1.add(prices[i]);
            sum+=prices[i];
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println(list1);
        double average=sum/prices.length;
        System.out.println("average of array is "+average);
        System.out.println("Maximum element of array is"+max);
    }
    public static void main(String[] args) {
        Question7 q6=new Question7();
        q6.arraytoArraylist();
    }
}
