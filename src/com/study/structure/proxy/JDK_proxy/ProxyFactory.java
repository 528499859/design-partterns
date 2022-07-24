package com.study.structure.proxy.JDK_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 获取代理对象的工厂类 代理类也实现了对应的接口
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation trainStation = new TrainStation();

    public SellTicket getProxyObject(){
        //返回代理对象
        /**
         * 参数信息
         * ClassLoader loader 类加载器，用来加载代理类
         * Class<?>[] interfaces
         * InvocationHandler h
         */
        SellTicket sellTicket = (SellTicket) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 参数说明
                     * @param proxy 代理对象 和sellTicket是同一个对象 在invoke中基本不用
                     * @param method 对接口中的方法 进行封装的method对象
                     * @param args 调用方法的实际参数
                     * @return 返回值 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("invoke方法执行了");
                        System.out.println("增强");
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                });
        return sellTicket;
    }
}
