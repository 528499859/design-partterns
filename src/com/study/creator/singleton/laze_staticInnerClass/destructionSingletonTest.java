package com.study.creator.singleton.laze_staticInnerClass;

import java.io.*;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * //测试破坏单例模式
 */
public class destructionSingletonTest {
    public static void main(String[] args) throws Exception {
        //writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }
    //向文件中写数据（对象）
    public static void writeObject2File() throws IOException {
        //获取singleton对象
        Singleton singleton = Singleton.getInstance();
        //创建对象字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/com/study/singleton/a.txt"));
        //写对象
        oos.writeObject(singleton);
        //关闭流 释放资源
        oos.close();
    }
    //从文件中读数据（对象）
    public static void readObjectFromFile() throws Exception {
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/com/study/singleton/a.txt"));
        //读取对象
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        //释放资源
        ois.close();
    }
}
