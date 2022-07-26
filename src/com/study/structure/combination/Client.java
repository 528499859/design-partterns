package com.study.structure.combination;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理",2);
        menu1.add(new MenuItem("页面访问",3));
        menu1.add(new MenuItem("展开菜单",3));
        menu1.add(new MenuItem("编辑菜单",3));
        menu1.add(new MenuItem("删除菜单",3));

        MenuComponent menu2 = new Menu("权限管理",2);
        menu2.add(new MenuItem("页面访问",3));
        menu2.add(new MenuItem("提交保存",3));

        MenuComponent menu3 = new Menu("角色管理",2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));
        menu3.add(new MenuItem("修改角色",3));

        menu3.add(new Menu("角色详细管理",3));
        menu3.getChild(3).add(new MenuItem("角色",4));

        menu1.print();
        System.out.println("================================");
        menu2.print();
        System.out.println("================================");
        menu3.print();
    }
}
