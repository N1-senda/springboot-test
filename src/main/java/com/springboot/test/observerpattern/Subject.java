package com.springboot.test.observerpattern;

/**
 * @author xumengsen
 * @Title: Subject
 * @Description: TODO
 * @date 2019/3/7
 */
public interface Subject {

    void registerObserver(Observer o);

    void notifyObservers(String tweet);

}
