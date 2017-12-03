package com.amon.designpattern.observer;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2017/12/3.
 */
public interface Observer {

    /**
     * 更新观察者的信息
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    public void update(Subject subject);

}
