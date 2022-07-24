package com.study.creator.prototype.deep_clone;

import java.io.*;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CitationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation = new Citation();
        citation.setStudent(new Student("张三",15));

        Citation citation1 = citation.clone();
        citation1.getStudent().setName("李四");

        citation.show();
        citation1.show();


       /* //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./a.txt"));
        //写对象
        oos.writeObject(citation);
        //释放资源
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();

        citation1.getStudent().setName("李四");
        citation1.show();
        citation.show();
*/
    }
}
