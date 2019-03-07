package com.springboot.test.strategypattern;

/**
 * @author xumengsen
 * @Title: Validator
 * @Description: TODO
 * @date 2019/3/7
 */
public class Validator {

    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy v) {
        this.strategy = v;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
