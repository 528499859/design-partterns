package com.study.structure.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 代理对象工厂，获取代理对象 CGLIB方式
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation;

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似JDK代理中的proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = method.invoke(trainStation, objects);
        System.out.println("执行了");
        return obj;
    }
}
