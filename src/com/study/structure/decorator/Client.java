package com.study.structure.decorator;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        FastFood fastFood  = new FriedRice();
        System.out.println(fastFood.getDesc()+" "+fastFood.cost()+"元");

        System.out.println("===================");
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+" "+fastFood.cost()+"元");

        System.out.println("=================");
        //再加一分鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+" "+fastFood.cost()+"元");

        System.out.println("==================");

        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc()+" "+fastFood.cost()+"元");
    }
}
