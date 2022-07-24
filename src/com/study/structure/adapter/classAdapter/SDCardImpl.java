package com.study.structure.adapter.classAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class SDCardImpl  implements SDCard{

    private String sdMsg;

    @Override
    public String SDread() {
        return sdMsg;
    }

    @Override
    public void SDWrite(String msg) {
        this.sdMsg = msg;
    }
}
