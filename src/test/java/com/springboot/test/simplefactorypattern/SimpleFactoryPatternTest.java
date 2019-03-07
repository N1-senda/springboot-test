package com.springboot.test.simplefactorypattern;

import org.junit.Test;

/**
 * @author xumengsen
 * @Title: SimpleFactoryPatternTest
 * @Description: TODO
 * @date 2019/3/7
 */
public class SimpleFactoryPatternTest {

    @Test
    public void simpleFactoryPatternTest1() {
        Product p = ProductFactory1.createProduct("loan");
        System.out.println(p);
    }

    @Test
    public void simpleFactoryPatternTest2() {
        Product p = ProductFactory2.createProduct("loan");
        System.out.println(p);
    }
}
