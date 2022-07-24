package com.study.creator.factory.simpleFactory;



/**
 * @author 一只小菜鸡
 * @version 1.0
 * 简单coffee工厂
 *
 */
public class CoffeeFactory {

    public static Coffee getCoffee(String type){
        Coffee coffee;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("没有此咖啡");
        }
        return coffee;
    }
}
