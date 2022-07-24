package com.study.structure.adapter.classAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String SDread() {
        return readTF();
    }

    @Override
    public void SDWrite(String msg) {
        writeTF(msg);
    }
}
