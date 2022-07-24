package com.study.creator.singleton.hungry_staticParam;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 饿汉式 单例：静态成员变量
 */
public class Singleton {

    //1 私有构造方法 防止外界通过new 创建对象
    private Singleton(){}

    //在本类中创建本类对象
    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton(){
        return singleton;
    }


}
