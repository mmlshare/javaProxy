package com.mmlshare.java.proxy.cohesive._1;

public class GuNaiXin implements GiftSender{

    private GiftSender giftSender;

    @Override
    public void sendGift(String gift) {
        System.out.println(getSenderName()+"请"+giftSender.getSenderName()+"帮忙送礼物："+gift);
        giftSender.sendGift(gift);
    }

    @Override
    public String getSenderName() {
        return "古乃欣";
    }

    public GuNaiXin(GiftSender giftSender) {
        this.giftSender = giftSender;
    }
}
