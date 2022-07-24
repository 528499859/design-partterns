package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 鸡蛋类（具体装饰角色）
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(fastFood,1,"鸡蛋");
    }

    @Override
    public float cost() {
        //计算
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"+"+getFastFood().getDesc();
    }
}
