package com.study.creator.singleton.hungry_static_block;


/**
 * @author 一只小菜鸡
 * @version 1.0
 * 静态代码块
 */
public class Singleton {

    private static Singleton singleTon = null;

    private Singleton(){};

    static{
        singleTon = new Singleton();
    }
    public static Singleton getSingleton(){
        return singleTon;
    }
}
