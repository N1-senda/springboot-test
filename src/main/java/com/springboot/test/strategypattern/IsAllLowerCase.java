package com.springboot.test.strategypattern;

/**
 * @author xumengsen
 * @Title: IsAllLowerCase
 * @Description: TODO
 * @date 2019/3/7
 */
public class IsAllLowerCase implements ValidationStrategy {

    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
