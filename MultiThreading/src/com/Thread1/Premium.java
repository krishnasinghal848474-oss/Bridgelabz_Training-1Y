package com.Thread1;

public class Premium {
    public static Thread getThread() {
        Thread premiumUser = new Thread(new BankAccount("krishna", "Premium"));
        premiumUser.setPriority(10);
        return premiumUser;
    }
}

