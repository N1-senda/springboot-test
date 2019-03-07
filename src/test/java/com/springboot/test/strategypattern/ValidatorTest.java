package com.springboot.test.strategypattern;

import org.junit.Test;

/**
 * @author xumengsen
 * @Title: ValidatorTest
 * @Description: TODO
 * @date 2019/3/7
 */
public class ValidatorTest {

    @Test
    public void validate1() {
        Validator numericValidator = new Validator(new IsNumeric());
        boolean b1 = numericValidator.validate("aaaa");
        System.out.println(b1); // false
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCaseValidator.validate("bbbb");
        System.out.println(b2); // true
    }

    @Test
    public void validate2() {
        Validator numericValidator = new Validator((String s) -> s.matches("\\d+"));
        boolean b1 = numericValidator.validate("aaaa");
        System.out.println(b1); // false
        Validator lowerCaseValidator = new Validator(s -> s.matches("[a-z]+"));
        boolean b2 = lowerCaseValidator.validate("bbbb");
        System.out.println(b2); // true
    }
}
