package com.study.creator.singleton.hungry_enum;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 枚举类型实现单例，枚举是极力推荐的单例实现模式，因为枚举是线程安全的，并且只会加载一次，设计者
 * 充分利用枚举的特性来实现单例模式，枚举写法简单，而且枚举类型是所有单例实现中唯一一种不会被破坏的
 * 单例实现模式
 */
public enum Singleton {
    INSTANCE;
}
