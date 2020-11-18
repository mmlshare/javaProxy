package com.mmlshare.java.proxy.inherit;

public class Main {
    public static void main(String[] args) {
        System.out.println("在家的佩奇");
        EatPig peiQi = new PeiQiPig();
        peiQi.eat();

        System.out.println("\n朋友家的佩奇：");
        EatPig peiQiInOtherHome = new PeiQiPigInOtherHome();
        peiQiInOtherHome.eat();
    }
}
