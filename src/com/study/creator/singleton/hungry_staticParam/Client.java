package com.study.creator.singleton.hungry_staticParam;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
    }
}
