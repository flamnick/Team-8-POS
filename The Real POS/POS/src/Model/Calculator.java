/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Class to calculate prices of all user selected items and return total.
 *
 * @author Team 8
 */
public class Calculator {
    /**
     * the total for the transaction.
     */
    double total;
    
    /**
     * Adds to the total by the number passed in each time this method is called.
     * @param inputDouble the amount to add to our total.
     */
    public void addToTotal(double inputDouble)
    {
        total = (total + inputDouble);
    }
    
    /**
     * gets our total from our calculator class.
     * @return total
     */
    public double getTotal()
    {
        return total;
    }
    
    /**
     * Resets our total to 0.
     */
    public void clearTotal()
    {
        total = 0;
    }
    
    /**
     * Calculates our post-tax total by taking the double for tax rate, dividing it by 100 to get a percent value, then multiplying the total value by this percent, adding it to the total.
     * @param taxRate Our tax rate.
     */
    public void calculatePostTaxTotal(double taxRate)
    {
        taxRate= (taxRate/100);
        total = (total * taxRate) + total;
    }
}