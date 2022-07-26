package com.study.structure.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 工厂类将该类设计为单例
 */
public class BoxFactory {

    private static BoxFactory boxFactory;

    private Map<String,AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("O",new OBox());
        map.put("L",new LBox());
    }

    public static synchronized BoxFactory buildBoxFactory(){
        if (boxFactory==null){
            boxFactory = new BoxFactory();
        }
        return boxFactory;
    }
    public AbstractBox getInstance(String type){
        return map.get(type);
    }
}
