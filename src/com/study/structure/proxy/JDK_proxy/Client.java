package com.study.structure.proxy.JDK_proxy;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket sellTicket = proxyFactory.getProxyObject();
        sellTicket.sell();
    }
}
