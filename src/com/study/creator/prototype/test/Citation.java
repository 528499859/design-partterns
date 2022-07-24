package com.study.creator.prototype.test;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Citation implements Cloneable{

    //三号学生上的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {

        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(name+"同学很优秀");
    }
}
