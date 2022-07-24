package com.study.structure.adapter.classAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * @ClassName TFCard.java
 * @Description 适配者接口
 * @createTime 2022/7/21 11:58
 */
public interface TFCard {
    //从TF卡中读数据
    String readTF();

    //从TF卡中写数据
    void writeTF(String msg);
}
