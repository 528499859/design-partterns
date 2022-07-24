package com.study.creator.builder.demo01;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public abstract class Builder {
    //声明bike类型的变量
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
