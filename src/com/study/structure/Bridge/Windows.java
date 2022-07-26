package com.study.structure.Bridge;

/**
 * @author 一只小菜鸡
 * @version 1.0
 * 扩展抽象化角色
 */
public class Windows extends OpratingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.deCode(fileName);
    }
}
