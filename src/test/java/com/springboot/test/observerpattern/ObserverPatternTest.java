package com.springboot.test.observerpattern;

import org.junit.Test;

/**
 * @author xumengsen
 * @Title: ObserverPatternTest
 * @Description: TODO
 * @date 2019/3/7
 */
public class ObserverPatternTest {

    @Test
    public void observerPatternTest1() {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObservers("The queen said her favourite book is Java 8 in Action!");
    }


    @Test
    public void observerPatternTest2() {
        Feed f = new Feed();
        f.registerObserver((String tweet) -> {
            if (tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY! " + tweet);
            }
        });
        f.registerObserver((tweet) -> {
            if (tweet != null && tweet.contains("queen")) {
                System.out.println("Yet another news in London... " + tweet);
            }
        });
        f.registerObserver((tweet) -> {
            if (tweet != null && tweet.contains("wine")) {
                System.out.println("Today cheese, wine and news! " + tweet);
            }
        });
        f.notifyObservers("The queen said her favourite book is Java 8 in Action!");
    }
}
