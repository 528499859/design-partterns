package com.study.creator.factory.before;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
