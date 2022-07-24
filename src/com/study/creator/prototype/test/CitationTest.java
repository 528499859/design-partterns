package com.study.creator.prototype.test;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws Exception{
        //创建原型对象
        Citation citation = new Citation();
        Citation zhangsan = citation.clone();
        zhangsan.setName("张三");
        citation.setName("李四");

        citation.show();
        zhangsan.show();
    }
}
