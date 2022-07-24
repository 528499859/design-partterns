package com.study.creator.factory.before;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            return null;
        }
        return coffee;
    }
}
