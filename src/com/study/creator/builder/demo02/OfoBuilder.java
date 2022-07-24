package com.study.creator.builder.demo02;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * ofo构建者
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
