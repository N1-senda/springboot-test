package com.springboot.test.templatemethodpattern;

import java.util.function.Consumer;

/**
 * @author xumengsen
 * @Title: OnlineBankingLambda
 * @Description: TODO
 * @date 2019/3/7
 */
public class OnlineBankingLambda {

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer c = new Customer(id, "Jhon");
        makeCustomerHappy.accept(c);
    }

}
