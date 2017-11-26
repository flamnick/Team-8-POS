/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Class to calculate prices of all selected items and return total.
 *
 * @author Team 8
 */
public class Calculator {
    /**
     * the total.
     */
    double total;
    
    public void addToTotal(double inputDouble)
    {
        total = (total + inputDouble);
    }
    
    public double getTotal()
    {
        return total;
    }
    
    public void clearTotal()
    {
        total = 0;
    }
    
    public void calculatePostTaxTotal(double taxRate)
    {
        taxRate= (taxRate/100);
        total = (total * taxRate) + total;
    }
}