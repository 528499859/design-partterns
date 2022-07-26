package com.study.structure.Bridge;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {

        OpratingSystem os = new Mac(new RMVBFile());
        os.play("hh");
    }
}
