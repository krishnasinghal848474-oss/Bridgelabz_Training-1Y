package com.Thread1;

public class runner {
    public static void main(String[] args) {
        Thread premiumUser = Premium.getThread();
        Thread regularUser = RegularUser.getThread();
        Thread basicUser = BasicUser.getThread();

        premiumUser.start();
        regularUser.start();
        basicUser.start();
    }
}

