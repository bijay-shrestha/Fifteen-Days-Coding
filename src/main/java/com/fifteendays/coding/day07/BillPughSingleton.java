package com.fifteendays.coding.day07;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("Bill Pugh Singleton instance created!");
    }

    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.printf("Doing work ... Bill Pugh Singleton is working! " + this.hashCode());
    }
}
