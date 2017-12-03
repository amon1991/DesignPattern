package com.amon.designpattern.observer.javadefaultimpl;

import java.util.Observable;
import java.util.Observer;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public class ConcreteObserver implements Observer {

    private String name;

    private String concreteState;

    @Override
    public void update(Observable o, Object arg) {

        // 第一种是推的方式
        System.out.println(name+ "获取新消息："+arg);

        // 第二种是拉的方式
        System.out.println(name + "获取新消息："+((ConcreteSubject)o).getConcreteState());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
