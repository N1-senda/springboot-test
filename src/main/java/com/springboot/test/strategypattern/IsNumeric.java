package com.springboot.test.strategypattern;

/**
 * @author xumengsen
 * @Title: IsNumeric
 * @Description: TODO
 * @date 2019/3/7
 */
public class IsNumeric implements ValidationStrategy {

    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
