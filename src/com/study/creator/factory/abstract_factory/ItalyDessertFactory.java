package com.study.creator.factory.abstract_factory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 意大利风味工厂
 */
public class ItalyDessertFactory  implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDesert() {
        return new Trimisu();
    }
}
