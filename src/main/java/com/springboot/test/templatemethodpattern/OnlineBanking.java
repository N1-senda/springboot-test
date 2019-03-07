package com.springboot.test.templatemethodpattern;

/**
 * @author xumengsen
 * @Title: OnlineBanking
 * @Description: TODO
 * @date 2019/3/7
 */
public abstract class OnlineBanking {

    public void processCustomer(int id) {
        Customer c = new Customer(id, "Jhon");
        makeCustomerHappy(c);
    }

    abstract void makeCustomerHappy(Customer c);

}
