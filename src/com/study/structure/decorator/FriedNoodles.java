package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 炒面（具体构件角色）
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(9,"炒面");
    }

    @Override
    public float cost() {
        return 0;
    }
}
