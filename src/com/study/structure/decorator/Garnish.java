package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public abstract class Garnish extends FastFood{
    //声明快餐类的变量
    private FastFood fastFood;

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
