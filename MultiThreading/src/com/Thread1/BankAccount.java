package com.Thread1;

public class BankAccount implements Runnable {
    public String accountHolderName;
    public String accountType;
    public BankAccount(String accountHolderName, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("User"+accountHolderName);
                System.out.println("Account type"+accountType);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(accountHolderName + " is wrong");
        }
    }
}
