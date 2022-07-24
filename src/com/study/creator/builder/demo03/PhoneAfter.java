package com.study.creator.builder.demo03;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class PhoneAfter {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;
    //私有构造方法
    private PhoneAfter(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public  Builder screen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory){
            this.memory =memory;
            return this;
        }
        public Builder mainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }
        public PhoneAfter build(){
            return new PhoneAfter(this);
        }
    }

    @Override
    public String toString() {
        return "PhoneAfter{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}
