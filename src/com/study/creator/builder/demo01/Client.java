package com.study.creator.builder.demo01;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        //让指挥者 组装自行车
        Bike bike = director.constructor();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }


}
