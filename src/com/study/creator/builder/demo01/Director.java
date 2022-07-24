package com.study.creator.builder.demo01;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 指挥者
 */
public class Director {
    //声明builder类型的变量
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }
    //组长自行车
    public Bike constructor(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
