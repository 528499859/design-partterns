package com.study.structure.Bridge;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 具体实现化角色
 */
public class RMVBFile implements VideoFile{
    @Override
    public void deCode(String fileName) {
        System.out.println("RMVB视频文件"+fileName);
    }
}
