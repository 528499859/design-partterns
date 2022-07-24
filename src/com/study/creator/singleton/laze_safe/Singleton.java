package com.study.creator.singleton.laze_safe;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 双重检查锁方式
 * 在双重检查锁模式下，使用volatile关键字 是一种比较好的单例实现方式，能够保证多线程情况下线程安全，也不会有性能问题
 */
public class Singleton {

    private Singleton (){};
    //volatile 关键字 可以保证有序性和可见性
    private static volatile Singleton singleton = null;

    public static Singleton getInstance(){
        //第一次判断 如果对象不为空则不需要争抢锁，直接返回null
        if (singleton==null){
            synchronized (Singleton.class){
                //第二次判断
                if (singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
