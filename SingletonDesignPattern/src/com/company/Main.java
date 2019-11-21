package com.company;


public class Main {

    public static void main(String[] args) {

        Singleton instance1 =Singleton.getInstance();
        Singleton instance2 =Singleton.getInstance();

        System.out.println("s1 hash key :"+instance1.hashCode());
        System.out.println("s2 hash key :"+instance2.hashCode());
    }
}
