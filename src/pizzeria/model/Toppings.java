/*
        Name: Dana Alsibi
        Assignment:  Assignment 4
        Program: a Point of Sale Application
        Date:  March 19th, 2020
    
        Description: an application that can be used for calculating and 
        printing the receipts for the customer orders of a pizza restaurant
        
 */
package pizzeria.model;

/**
 *
 * @author danasebai
 */
public enum Toppings {
    /*constant Pizza tooping that can be ordered by the customer */
    CHEESE("Cheese", 1.00),
    MUSHROOMS("Mushrooms", 1.25),
    OLIVES("Olives", 1.50),
    PEPPERONI("Pepperoni", 1.75);

    private String toppings;
    private double toppingPrice;

    //private constructor for the enum Toopings class
    private Toppings(String toppings, double toppingPrice) {
        this.toppings = toppings;
        this.toppingPrice = toppingPrice;
    }

    /**
     * @param toppings to set the topping name as String
     */
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    /**
     * @param toppingPrice to set the price of each topping as double
     */
    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    /**
     * @return the topping name
     */
    public String getToppings() {
        return toppings;
    }

    /**
     * @return the price of each topping
     */
    public double getToppingPrice() {
        return toppingPrice;
    }

}
