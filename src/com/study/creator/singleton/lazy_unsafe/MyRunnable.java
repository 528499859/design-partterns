package com.study.creator.singleton.lazy_unsafe;

import java.util.concurrent.Callable;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class MyRunnable implements Callable {

    @Override
    public Object call() throws Exception {
        Singleton singleton = Singleton.getSingleton();
        return singleton;
    }
}
