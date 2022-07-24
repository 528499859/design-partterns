package com.study.structure.adapter.objectAdapter;

import com.study.structure.adapter.classAdapter.TFCard;
import com.study.structure.adapter.classAdapter.TFCardImpl;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 适配器类
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String SDread() {
        return tfCard.readTF();
    }

    @Override
    public void SDWrite(String msg) {
        tfCard.writeTF(msg);
    }
}
