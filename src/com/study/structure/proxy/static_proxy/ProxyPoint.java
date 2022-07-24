package com.study.structure.proxy.static_proxy;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class ProxyPoint implements SellTicket{

    private TrainStation trainStation;

    @Override
    public void sell() {
        if (trainStation==null){
            trainStation = new TrainStation();
        }
        System.out.println("代收点收取亿点点费用");
        trainStation.sell();
    }
}
