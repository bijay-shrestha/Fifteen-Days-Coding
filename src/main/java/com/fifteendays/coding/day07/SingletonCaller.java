package com.fifteendays.coding.day07;

public class SingletonCaller {

    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        Singleton s3 = Singleton.INSTANCE;

        System.out.println(s1 == s2);
        System.out.println(s1 ==  s3);

        s1.doSomething();
    }
}
