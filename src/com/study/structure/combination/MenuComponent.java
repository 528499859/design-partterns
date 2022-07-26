package com.study.structure.combination;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 菜单组件 抽象根节点
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //移除子菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }
    //获取菜单或者菜单项的名称
    public  String getName(){
        return name;
    }
    //打印菜单名称（包含菜单和菜单项）
    public abstract void print();
}
