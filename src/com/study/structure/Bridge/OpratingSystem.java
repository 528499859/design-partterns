package com.study.structure.Bridge;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 抽象化角色
 */
public abstract class OpratingSystem {

    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }
    public abstract void play(String fileName);
}
