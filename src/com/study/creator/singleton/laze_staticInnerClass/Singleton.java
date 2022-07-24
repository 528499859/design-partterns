package com.study.creator.singleton.laze_staticInnerClass;

import java.io.Serializable;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 静态内部类  单例对象由内部类产生，在jvm加载外部类时，不会加载静态内部类，只有当内部类的属性/方法被调用时才会被加载，
 * 并初始化静态属性
 * 开源项目中较为常用的 单例模式，在没有任何锁的情况下保证了多线程的安全，并且也没有任何新能影响和空间浪费
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    //判断flag的值是否是true 如果是true 则不是第一次访问，抛出异常
    //为false 是第一次访问 可以通过
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException();
            } else {
                flag = true;
            }
        }
    }
    public static Singleton getInstance(){
        return SingletonHolder.SINGLETON;
    }
    private static class SingletonHolder{
        private static final Singleton SINGLETON = new Singleton();

    }

    /*//进行反序列化时，会自动调用此方法，将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.SINGLETON;
    }*/
}
