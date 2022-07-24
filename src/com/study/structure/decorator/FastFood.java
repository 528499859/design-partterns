package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 快餐类
 * 抽象构件角色
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public abstract float cost();
}
