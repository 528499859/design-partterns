package com.study.creator.prototype.demo;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("具体对象创建完成");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return super.clone();
    }
}
