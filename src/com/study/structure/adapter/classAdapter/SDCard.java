package com.study.structure.adapter.classAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 目标接口
 */
public interface SDCard {

    //从SD卡中读数据
    String SDread();

    //从SD卡中写数据
    void SDWrite(String msg);
}
