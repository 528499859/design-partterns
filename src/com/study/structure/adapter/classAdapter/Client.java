package com.study.structure.adapter.classAdapter;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        computer.writeSD(sdCard,"this is new SDCard");
        String msg = computer.readSD(sdCard);
        System.out.println(msg);
        System.out.println("======================");
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        computer.writeSD(sdAdapterTF,"this is first tf card");
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
