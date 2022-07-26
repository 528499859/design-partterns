package com.study.structure.Flyweight;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * I图形类（具体享元角色）
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
