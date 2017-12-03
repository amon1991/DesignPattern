package com.amon.designpattern.observer.javadefaultimpl;

import java.util.Observable;

/**
 * 目标类
 * @author yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public class ConcreteSubject extends Observable {

    private String concreteState;

    public String getConcreteState() {
        return concreteState;
    }

    public void setConcreteState(String concreteState) {
        this.concreteState = concreteState;

        this.setChanged();

        // 推的方式
        this.notifyObservers(concreteState);

    }
}
