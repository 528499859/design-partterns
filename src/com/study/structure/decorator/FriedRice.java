package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 炒饭（具体构件角色）
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
