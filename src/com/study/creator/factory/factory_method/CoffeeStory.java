package com.study.creator.factory.factory_method;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CoffeeStory {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    //点咖啡
    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
