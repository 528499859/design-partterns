package com.study.creator.builder.demo02;


/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new MobileBuilder();
        Bike mobileBike = builder.constructor();
        System.out.println(mobileBike.getFrame());
        System.out.println(mobileBike.getSeat());
    }


}
