package com.mmlshare.java.proxy.cohesive._1;

/**
 * 礼物派送者
 */
public interface GiftSender {
    /**
     * 赠送礼物
     * @param gift
     */
    void sendGift(String gift);

    String getSenderName();
}
