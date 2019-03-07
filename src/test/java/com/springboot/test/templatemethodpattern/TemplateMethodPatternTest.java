package com.springboot.test.templatemethodpattern;

import org.junit.Test;

/**
 * @author xumengsen
 * @Title: TemplateMethodPatternTest
 * @Description: TODO
 * @date 2019/3/7
 */
public class TemplateMethodPatternTest {

    @Test
    public void templateMethodPatternTest() {
        new OnlineBankingLambda().processCustomer(1337, (Customer c) -> System.out.println("Hello " + c.getName()));
    }

}
