package com.study.structure.combination;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 菜单项，叶子节点角色
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}
