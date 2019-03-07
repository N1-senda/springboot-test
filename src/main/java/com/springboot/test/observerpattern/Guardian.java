package com.springboot.test.observerpattern;

/**
 * @author xumengsen
 * @Title: Guardian
 * @Description: TODO
 * @date 2019/3/7
 */
public class Guardian implements Observer {

    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("queen")) {
            System.out.println("Yet another news in London... " + tweet);
        }
    }

}
