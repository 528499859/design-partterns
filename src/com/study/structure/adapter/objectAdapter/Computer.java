package com.study.structure.adapter.objectAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Computer{
    //从sd卡中读取数据
    public String readSD(SDCard sdCard){
        if (sdCard==null){
            throw new NullPointerException("SDCard can not be null");
        }
        return sdCard.SDread();
    }
    public void writeSD(SDCard sdCard, String msg){
        if (sdCard==null){
            throw new NullPointerException("SDCard can not be null");
        }
        sdCard.SDWrite(msg);
    }
}
