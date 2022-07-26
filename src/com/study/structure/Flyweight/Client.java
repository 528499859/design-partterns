package com.study.structure.Flyweight;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.buildBoxFactory().getInstance("I");
        box1.display("blue");

        AbstractBox box2 = BoxFactory.buildBoxFactory().getInstance("L");
        box2.display("black");

        AbstractBox box3 = BoxFactory.buildBoxFactory().getInstance("O");
        box3.display("write");
    }
}
