package com.study.creator.factory.abstract_factory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 美式风味 的甜品工厂 生产美式咖啡慕斯
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDesert() {
        return new MatchMousse();
    }
}
