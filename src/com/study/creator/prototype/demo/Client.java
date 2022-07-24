package com.study.creator.prototype.demo;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype realizetype1 = (Realizetype) realizetype.clone();
        System.out.println(realizetype==realizetype1);
    }
}
