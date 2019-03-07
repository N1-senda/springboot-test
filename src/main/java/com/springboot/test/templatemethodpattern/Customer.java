package com.springboot.test.templatemethodpattern;

/**
 * @author xumengsen
 * @Title: Customer
 * @Description: TODO
 * @date 2019/3/7
 */
public class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
