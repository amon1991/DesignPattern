package com.amon.designpattern.observer;

/**
 * 具体的观察者对象，实现更新的方法
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public class ConcreteObserver implements Observer{

    /**
     * 观察者的状态
     */
    private String observerState;

    private String name;

    /**
     * 获取目标类的状态同步到观察者的状态
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {

        observerState = ((ConcreteSubject)subject).getSubjectState();

        System.out.println(name+"获取新消息，消息内容为："+observerState);

    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
