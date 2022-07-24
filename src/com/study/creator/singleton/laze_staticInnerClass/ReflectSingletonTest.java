package com.study.creator.singleton.laze_staticInnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 通过反射破坏单例对象
 */
public class ReflectSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取singleton字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        //获取无参构造方法
        Constructor<Singleton> cons = singletonClass.getDeclaredConstructor();
        //取消访问检查
        cons.setAccessible(true);
        //创建对象
        Singleton singleton1 = cons.newInstance();
        Singleton singleton2 = cons.newInstance();
        System.out.println(singleton1==singleton2);
    }
}
