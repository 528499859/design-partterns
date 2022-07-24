package com.study.creator.builder.demo03;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        PhoneAfter phoneAfter = new PhoneAfter.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿")
                .mainBoard("微星")
                .build();
        System.out.println(phoneAfter.toString());

    }
}
