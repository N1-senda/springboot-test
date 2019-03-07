package com.springboot.test.chainofresponsibilitypattern;

/**
 * @author xumengsen
 * @Title: HeaderTextProcessing
 * @Description: TODO
 * @date 2019/3/7
 */
public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    public String handleWork(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }

}
