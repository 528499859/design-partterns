package com.study.creator.factory.simpleFactory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStory coffeeStory = new CoffeeStory();
        Coffee coffee = coffeeStory.makeCoffee("american");
        System.out.println(coffee.getName());
    }
}
