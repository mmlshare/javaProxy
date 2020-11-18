package com.mmlshare.java.proxy.cohesive._2;

public class RedisPersistence implements Persistence{
    @Override
    public void updateData(String data) {
        System.out.println("更新Redis："+data);
    }
}
