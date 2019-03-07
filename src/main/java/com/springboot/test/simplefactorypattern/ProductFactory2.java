package com.springboot.test.simplefactorypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author xumengsen
 * @Title: ProductFactory2
 * @Description: TODO
 * @date 2019/3/7
 */
public class ProductFactory2 {

    final static Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }

    public static Product createProduct(String name) {
        Supplier<Product> p = map.get(name);
        if (p != null) {
            return p.get();
        }
        throw new IllegalArgumentException("No such product " + name);
    }
}
