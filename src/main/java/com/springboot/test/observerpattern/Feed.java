package com.springboot.test.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xumengsen
 * @Title: Feed
 * @Description: TODO
 * @date 2019/3/7
 */
public class Feed implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }

}
