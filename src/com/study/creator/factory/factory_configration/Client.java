package com.study.creator.factory.factory_configration;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
