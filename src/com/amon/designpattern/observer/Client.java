package com.amon.designpattern.observer;

/**
 * 客户端测试类
 * @author yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public class Client {

    public static void main(String[] args) {

        // 1、创建目标
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 2、创建观察者
        ConcreteObserver observerOne = new ConcreteObserver();
        observerOne.setName("One");

        ConcreteObserver observerTwo = new ConcreteObserver();
        observerTwo.setName("Two");

        // 3、注册观察者
        concreteSubject.attach(observerOne);
        concreteSubject.attach(observerTwo);

        // 4、目标发布最新的通知
        concreteSubject.setSubjectState("Hello world!");

    }

}
