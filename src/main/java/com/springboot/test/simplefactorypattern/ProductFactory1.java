package com.springboot.test.simplefactorypattern;

/**
 * @author xumengsen
 * @Title: ProductFactory1
 * @Description: TODO
 * @date 2019/3/7
 */
public class ProductFactory1 {

    public static Product createProduct(String name) {
        switch (name) {
            case "loan":
                return new Loan();
            case "stock":
                return new Stock();
            case "bond":
                return new Bond();
            default:
                throw new RuntimeException("No such product " + name);
        }
    }

}
