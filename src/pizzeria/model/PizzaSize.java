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
public enum PizzaSize {
    //constant Pizza Size that can be used by the customer
    SMALL("Small", 5.25),
    MEDIUM("Medium", 7.50),
    LARGE("Large", 9.95);

    private String pizzaSize;
    private double pizzaPrice;

    //private Constructor for enum class
    private PizzaSize(String pizzaSize, double pizzaPrice) {
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = pizzaPrice;
    }
     /**
      * @param pizzaSize to set the size name of the Pizza
      */
    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
     /**
      * @param pizzaPrice to set the price for each size
      */
    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
     /**
      * @return pizzaSize as a String
      */
    public String getPizzaSize() {
        return pizzaSize;
    }
    /**
     * @return the price of each size as a double
     */
    public double getPizzaPrice() {
        return pizzaPrice;
    }

}
