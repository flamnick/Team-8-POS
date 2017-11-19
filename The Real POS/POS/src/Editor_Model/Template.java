/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Model;

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
     * @param inputPrince
     */
    public void editButton(int buttonNumber, String inputName, double inputPrince) 
    {
        String oldName = buttonArray[buttonNumber].getName();
        buttonArray[buttonNumber].setName(inputName);
        firePropertyChange(DefaultController.ELEMENT_TEXT_PROPERTY)
        
        double oldPrice = buttonArray[buttonNumber].getPrice();
        buttonArray[buttonNumber].setPrice(inputPrince);
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
