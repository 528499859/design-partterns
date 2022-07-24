package com.study.creator.singleton.lazy_unsafe;


/**
 * @author 一只小菜鸡
 * @version 1.0
 * 线程不安全
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
