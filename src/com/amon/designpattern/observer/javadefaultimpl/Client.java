package com.amon.designpattern.observer.javadefaultimpl;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public class Client {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver observerOne = new ConcreteObserver();
        observerOne.setName("One");

        ConcreteObserver observerTwo = new ConcreteObserver();
        observerTwo.setName("Two");

        concreteSubject.addObserver(observerOne);
        concreteSubject.addObserver(observerTwo);

        concreteSubject.setConcreteState("Hello World!");

    }
}
