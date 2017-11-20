/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Model;
import Editor_Gui.*;
import Editor_Controller.*;

/**
 * Holds our data model at the higher level. The buttons are stored as an array.
 *
 * @author Team 8
 */
public class Template extends AbstractModel 
{

    /**
     * This is simply an array which holds our button data.
     */
    private Button[] buttonArray;
    private double taxRate;

    /**
     * Sets aside space in memory for 10 button objects, and makes those
     * objects.
     */
    public Template() {
        buttonArray = new Button[21];

        for (int i = 0; i < 20; i++) {
            buttonArray[i] = new Button();
        }

    }

    /**
     *
     * @param buttonNumber The button it's working on
     * @param inputName
     * @param inputPrice
     */
    public void editButton(int buttonNumber, String inputName, double inputPrice) 
    {
        String oldName = buttonArray[buttonNumber].getName();
        buttonArray[buttonNumber].setName(inputName);
        firePropertyChange(DefaultController.BUTTON_NAME_PROPERTY, oldName, inputName);
        
        
        double oldPrice = buttonArray[buttonNumber].getPrice();
        buttonArray[buttonNumber].setPrice(inputPrice);
        firePropertyChange(DefaultController.BUTTON_PRICE_PROPERTY, oldPrice, inputPrice);
    }
    
    public void setName(int buttonNumber, String inputName)
    {
        String oldName = buttonArray[buttonNumber].getName();
        buttonArray[buttonNumber].setName(inputName);
        firePropertyChange(DefaultController.BUTTON_NAME_PROPERTY, oldName, inputName);
    }
    
    public String getName(int buttonNumber)
    {
        return buttonArray[buttonNumber].getName();
    }
    
    public void setPrice(int buttonNumber, double inputPrice)
    {
        double oldPrice = buttonArray[buttonNumber].getPrice();
        buttonArray[buttonNumber].setPrice(inputPrice);
        firePropertyChange(DefaultController.BUTTON_PRICE_PROPERTY, oldPrice, inputPrice);
    }
    
    public double getPrice(int buttonNumber)
    {
        return buttonArray[buttonNumber].getPrice();
    }

    /**
     * Method for setting tax rate.
     *
     * @param taxRateInput
     */
    public void setTaxRate(double taxRateInput) {
        taxRate = taxRateInput;
    }

    /**
     * Method for getting tax rate.
     *
     * @return
     */
    public double getTaxRate() {
        return taxRate;
    }

}
