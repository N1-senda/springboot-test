package com.springboot.test.strategypattern;

/**
 * @author xumengsen
 * @Title: ValidationStrategy
 * @Description: TODO
 * @date 2019/3/7
 */
public interface ValidationStrategy {

    boolean execute(String s);
}
