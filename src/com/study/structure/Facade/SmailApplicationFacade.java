package com.study.structure.Facade;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class SmailApplicationFacade {
    private Light light;
    private AirCondition airCondition;
    private TV tv;

    public  SmailApplicationFacade(){
        light =new Light();
        airCondition = new AirCondition();
        tv =new TV();
    }
    public void say(String message){
        if (message.contains("开启")){
            on();
        }else if(message.contains("关闭")){
            off();
        }else{
            System.out.println("听不懂");
        }
    }
    private void on(){
        light.on();
        airCondition.on();
        tv.on();
    }

    private void off(){
        light.off();
        airCondition.off();
        tv.off();
    }
}
