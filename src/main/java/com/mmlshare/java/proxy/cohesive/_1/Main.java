package com.mmlshare.java.proxy.cohesive._1;

public class Main {
    public static void main(String[] args) {
        //声明月兔
        GiftSender yueRabbit = new YueRabbit();
        //古乃馨 让月兔帮助她
        GiftSender gunaixin = new GuNaiXin(yueRabbit);
        // 送礼物
        gunaixin.sendGift("鲜花");
    }
}
