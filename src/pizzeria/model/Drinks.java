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
public enum Drinks {
    //constant drinks that can be ordered by the customer 
    COKE("Coke", 1.25),
    JUICE("Juice", 1.95),
    CHOCOLATE_MILK("Chocolate Milk", 2.25);

    private String drinkName;
    private double drinkPrice;
    
    //private constructor for the enum Drinks class 
    private Drinks(String drinkName, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }
    /**
     * @param drinkName to set the drink name as String
     */
    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
    /**
     * @param drinkPrice to set the price of each drink
     */
    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
    /**
     * @return a drink name 
     */
    public String getDrinkName() {
        return drinkName;
    }
   /**
    * @return a price of each drink
    */
    public double getDrinkPrice() {
        return drinkPrice;
    }


}
