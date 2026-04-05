package com.Thread1;

public class RegularUser {
    public static Thread getThread() {
        Thread regularUser = new Thread(new BankAccount("Shivam", "Regular"));
        regularUser.setPriority(5);
        return regularUser;
    }
}

