package com.fifteendays.coding.day07;

public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.printf("Singleton is working! " + this.hashCode());
    }

    public String getValue(){
        return "Hello from the only Singleton instance";
    }
}
