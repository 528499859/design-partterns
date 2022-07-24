package com.study.creator.factory.simpleFactory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public abstract class Coffee {


    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }
    public void addMilk(){
        System.out.println("加奶");
    }

}
