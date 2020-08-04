package com.kodilla.rozneproby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class RozneprobyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RozneprobyApplication.class, args);
        // Towary
        Order order1 = new Order(123, "Toster XC321", 199.99, 1);
        Order order2 = new Order(234, "Odkurzacz ZX 65e", 295.99, 2);
        Order order3 = new Order(345, "Worki do odkurzaczy 30 szt.", 29.50, 3);
        Order order4 = new Order(123, "Toster XC321", 199.99, 1);

        List<Order> orders = new ArrayList<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);


        System.out.println("Zamówienia wg ArraList:");
        System.out.println();

        for (int i = 0; i < orders.size(); i++){ //użycie pętli for dla wypisania jeden pod drugim
            System.out.println(orders.get(i));
        }

        System.out.println();

        Set<Order> uniqueOrders = new HashSet<>();

        uniqueOrders.add(order1);
        uniqueOrders.add(order2);
        uniqueOrders.add(order3);
        uniqueOrders.add(order4);

        System.out.println("Zamówienia wg HashSet:");
        System.out.println();

        for (Order theOrder: uniqueOrders){ //użycie pętli for each
            System.out.println(theOrder);
        }

        System.out.println("THE END");



    }

}
