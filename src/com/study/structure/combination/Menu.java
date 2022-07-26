package com.study.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 菜单类 属于树枝节点
 */
public class Menu extends MenuComponent{
    /**
     * 菜单可以有多个子菜单或者子菜单项
     */
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public void print() {
        //打印菜单名称
        System.out.println(name);
        //打印子菜单或者子菜单项名称
        menuComponents.forEach(MenuComponent::print);
    }
}
