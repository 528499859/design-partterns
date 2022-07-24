package com.study.structure.proxy.JDK_proxy;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("卖了一张票");
    }
}
