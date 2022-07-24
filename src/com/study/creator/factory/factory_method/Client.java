package com.study.creator.factory.factory_method;

import com.study.creator.factory.factory_method.imterface.AmericanCoffeeFactory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStory coffeeStory = new CoffeeStory();
        coffeeStory.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStory.orderCoffee();
        System.out.println(coffee.getName());
    }
}
