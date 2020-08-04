package com.kodilla.rozneproby;

public class Order {
    int orderNumber;
    String name;
    double price;
    int quantity;

    // konstruktor z metodami
    public Order(int orderNumber, String name, double price, int quantity){
        this.orderNumber = orderNumber;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // metoda toString - pokazanie towaru jako String
    public String toString(){
        return "Order number: " + orderNumber + ", name of good: " + name + ", unit price: " + price + ", quantity: " + quantity + "\n";
    }

    // getters
    public int getOrderNuber(){
        return orderNumber;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }


    public boolean equals(Object obj) {
        final Order o = (Order) obj;
        return this.orderNumber == (o.orderNumber) && this.name.equals(o.name) && this.price == (o.price) && this.quantity == (o.quantity);
    }

    public int hashCode() {
        return orderNumber;
    }
}
