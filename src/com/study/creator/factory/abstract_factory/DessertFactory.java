package com.study.creator.factory.abstract_factory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * @ClassName DessertFactory.java
 * @Description TODO
 * @createTime 2022/7/10 11:50
 */
public interface DessertFactory {
    //生产咖啡的功能
    Coffee createCoffee();
    //生产甜品的功能
    Dessert createDesert();
}
