package com.study.creator.singleton.laze_safe;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);
    }
}
