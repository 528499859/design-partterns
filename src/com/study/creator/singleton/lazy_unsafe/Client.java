package com.study.creator.singleton.lazy_unsafe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        FutureTask ft1 = new FutureTask(myRunnable);
        FutureTask ft2 = new FutureTask(myRunnable);
        new Thread(ft1).start();
        new Thread(ft2).start();

        Object singleton1 = ft1.get();
        Object singleton2 = ft2.get();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1==singleton2);
    }
}
