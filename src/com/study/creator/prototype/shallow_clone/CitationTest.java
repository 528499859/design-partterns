package com.study.creator.prototype.shallow_clone;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CitationTest {
    public static void main(String[] args) {
        Citation citation = new Citation();
        citation.setStudent(new Student("zhangsan",15));

        Citation citation1 = citation.clone();
        citation1.getStudent().setName("李四");
        citation.show();
        citation1.show();

    }
}
