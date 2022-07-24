package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 培根类
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood,2,"培根");
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
