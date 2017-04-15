package com.example.saketmayank.wtf2.constant;

import com.example.saketmayank.wtf2.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Chicken Burger", BigDecimal.valueOf(99.996), "Hot Chicken Burger with grilled chicken ", "chickenburger");
    public static final Product PRODUCT2 = new Product(2, "Hot Dog", BigDecimal.valueOf(89.9947), "Hot chilli Hot Dog", "hotdog");
    public static final Product PRODUCT3 = new Product(3, "Maggi Masala", BigDecimal.valueOf(49.998140), "2 minutes noodles cant be kept away", "maggi");
    public static final Product PRODUCT4 = new Product(4, "Pizza", BigDecimal.valueOf(249.9947), "Chicken tripple feast pizza", "pizza");
    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
        PRODUCT_LIST.add(PRODUCT4);
    }

    public static final String CURRENCY = "Rs ";
}