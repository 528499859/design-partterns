package com.study.creator.factory.abstract_factory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        DessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        Dessert desert = factory.createDesert();
        desert.show();
        System.out.println(coffee.getName());
    }
}
