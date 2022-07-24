package com.study.creator.factory.factory_method;


/**
 * @author 一只小菜鸡
 * @version 1.0
 * 简单coffee工厂
 *
 */
public interface CoffeeFactory {

    /**
     * 创建coffee的抽象方法
     * @return
     */
    public Coffee createCoffee();


}
