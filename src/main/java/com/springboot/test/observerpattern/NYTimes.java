package com.springboot.test.observerpattern;

/**
 * @author xumengsen
 * @Title: NYTimes
 * @Description: TODO
 * @date 2019/3/7
 */
public class NYTimes implements Observer {

    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("money")) {
            System.out.println("Breaking news in NY! " + tweet);
        }
    }

}
