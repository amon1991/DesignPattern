package com.amon.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册和删除观察者的接口
 * @author yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 向观察者集合注册指定观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除集合中的指定观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected  void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
