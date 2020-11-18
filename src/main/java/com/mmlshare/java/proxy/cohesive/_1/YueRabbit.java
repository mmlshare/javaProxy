package com.mmlshare.java.proxy.cohesive._1;

public class YueRabbit implements GiftSender{
    @Override
    public void sendGift(String gift) {
        System.out.println(getSenderName()+"送礼物："+gift);
    }

    @Override
    public String getSenderName() {
        return "月兔";
    }
}
