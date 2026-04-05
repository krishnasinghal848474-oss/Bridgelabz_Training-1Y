package com.Thread1;

public class BasicUser {
    public static Thread getThread() {
        Thread basicUser = new Thread(new BankAccount("Gaurav", "Basic"));
        basicUser.setPriority(1);
        return basicUser;
    }
}

