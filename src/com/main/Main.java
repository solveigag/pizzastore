package com.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer();
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Pepperoni");
        pizzas.add("Plain");
        pizzas.add("Four Cheese");
        customer.Order(pizzas);

    }
}
