package com.study.creator.factory.factory_configration;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中配置的全限定类名，并创建该类的对象
    //1 :定义容器对象 存储咖啡对象
    private static Map<String,Coffee> coffeeMap = new HashMap<>();
    //2: 加载配置文件 ，加载一次
    static{
        //创建properties对象
        Properties properties = new Properties();
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
            //从 properties集合中获取全限定类名床架对象
            Set<Object> keys = properties.keySet();
            keys.forEach(key->{
                try {
                    String className = properties.getProperty((String) key);
                    Class<?> clazz = Class.forName(className);
                    Coffee coffee = (Coffee) clazz.newInstance();
                    coffeeMap.put((String) key,coffee);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name){
        return coffeeMap.get(name);
    }
}
