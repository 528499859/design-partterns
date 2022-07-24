package com.study.creator.factory.factory_method.imterface;


import com.study.creator.factory.factory_method.AmericanCoffee;
import com.study.creator.factory.factory_method.Coffee;
import com.study.creator.factory.factory_method.CoffeeFactory;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * @ClassName AmericanCoffee.java
 * @Description 美式咖啡
 * @createTime 2022/7/9 13:29
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
