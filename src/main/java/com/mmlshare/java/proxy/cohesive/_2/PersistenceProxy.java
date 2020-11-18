package com.mmlshare.java.proxy.cohesive._2;

import java.util.List;

public class PersistenceProxy implements Persistence{
    /**
     * 内聚对象数组
     */
    private Persistence[] persistences;

    public PersistenceProxy(Persistence... persistences) {
        this.persistences = persistences;
    }

    @Override
    public void updateData(String data) {
        System.out.println("数据持久化代理类开始更新数据:"+data);
        for(Persistence persistence:persistences){
            persistence.updateData(data);
        }
    }
}
