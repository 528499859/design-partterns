package com.study.structure.Facade;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        SmailApplicationFacade sa = new SmailApplicationFacade();
        sa.say("全部开启");
    }
}
