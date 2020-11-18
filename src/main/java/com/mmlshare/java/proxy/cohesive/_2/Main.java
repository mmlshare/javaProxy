package com.mmlshare.java.proxy.cohesive._2;

public class Main {
    public static void main(String[] args) {

        Persistence mysql = new MySqlPersistence();
        Persistence redis = new RedisPersistence();

        //创建代理对象,对mysql实现和Redis实现进行聚合
        Persistence proxy = new PersistenceProxy(mysql,redis);
        proxy.updateData("数据");
    }
}
