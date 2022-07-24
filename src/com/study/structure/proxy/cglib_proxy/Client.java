package com.study.structure.proxy.cglib_proxy;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();

        proxyObject.sell();
    }
}
