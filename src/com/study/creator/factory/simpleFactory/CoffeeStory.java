package com.study.creator.factory.simpleFactory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CoffeeStory {
    public Coffee makeCoffee(String type){
        Coffee coffee = CoffeeFactory.getCoffee(type);
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }



}
