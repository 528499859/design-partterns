package com.study.structure.adapter.classAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 适配者类
 */
public class TFCardImpl implements TFCard{

    private String tfMsg;

    @Override
    public String readTF() {
        return tfMsg;
    }

    @Override
    public void writeTF(String msg) {
        this.tfMsg = msg;
    }
}
