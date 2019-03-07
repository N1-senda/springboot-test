package com.springboot.test.observerpattern;

/**
 * @author xumengsen
 * @Title: LeMonde
 * @Description: TODO
 * @date 2019/3/7
 */
public class LeMonde implements Observer {

    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("wine")) {
            System.out.println("Today cheese, wine and news! " + tweet);
        }
    }

}
