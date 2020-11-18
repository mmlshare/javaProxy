package com.mmlshare.java.proxy.inherit;

public class PeiQiPigInOtherHome extends PeiQiPig{

    @Override
    public void eat() {
        sayToOther();
        super.eat();
    }

    private void sayToOther(){
        System.out.println("佩奇对朋友说，我要吃零食啦");
    }
}
