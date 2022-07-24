package com.study.creator.factory.factory_method.imterface;

import com.study.creator.factory.factory_method.Coffee;
import com.study.creator.factory.factory_method.CoffeeFactory;
import com.study.creator.factory.factory_method.LatteCoffee;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 拿铁咖啡
 */
public class LatteCoffeeFactory  implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
