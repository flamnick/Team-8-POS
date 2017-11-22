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
    private int colorChoice;
    private int fontChoice;

    /**
     * Sets aside space in memory for 10 button objects, and makes those
     * objects.
     */
    public Template() {
        buttonArray = new Button[21];

        for (int i = 0; i < 20; i++) 
        {
            buttonArray[i] = new Button();
        }

    }

    /**
     *
     * @param buttonNumber The button it's working on
     * @param inputName
     * @param inputPrice
     * @param inputPicture
     */
    public void editButton(int buttonNumber, String inputName, double inputPrice, int inputPicture) 
    {
        buttonArray[buttonNumber].setName(inputName);

        buttonArray[buttonNumber].setPrice(inputPrice);
        
        buttonArray[buttonNumber].setPicture(inputPicture);
    }
    
    /**
     * This updates our button with the contents of our data holder.
     * @param buttonNumber
     * @param dataHolder 
     */
    public void updateButton(int buttonNumber, Editor_Gui.UserInfoBus dataHolder)
    {
        buttonArray[buttonNumber].setName(dataHolder.getName());

        buttonArray[buttonNumber].setPrice(dataHolder.getPrice());
        
        buttonArray[buttonNumber].setPicture(dataHolder.getPicture());
    }
    
    /**
     * This updates our data model with the users chosen font and color.
     * @param colorChoice
     * @param fontChoice 
     */
    public void updateTemplateAppearance(int colorChoice, int fontChoice)
    {
        this.colorChoice=colorChoice;
        this.fontChoice=fontChoice;
    }
    /**
     * This changes the name field of a particular button and fires a
     * property change informing the controller.
     * @param buttonNumber the button whose name we are replacing.
     * @param inputName the name we are replacing the button name field with.
     */
    public void setName(int buttonNumber, String inputName)
    {
        buttonArray[buttonNumber].setName(inputName);
    }
    
    /**
     * This gets the name from a particular button.
     * @param buttonNumber the button whose name we are getting.
     * @return 
     */
    public String getName(int buttonNumber)
    {
        return buttonArray[buttonNumber].getName();
    }
    
    /**
     * This sets the price within a particular button and informs
     * the controller of our change.
     * @param buttonNumber
     * @param inputPrice 
     */
    public void setPrice(int buttonNumber, double inputPrice)
    {
        buttonArray[buttonNumber].setPrice(inputPrice);
    }
    
    /**
     * This gets the price field within a particular button.
     * @param buttonNumber the button whose price we are getting.
     * @return 
     */
    public double getPrice(int buttonNumber)
    {
        return buttonArray[buttonNumber].getPrice();
    }
    
    public void setPictureChoice(int buttonNumber, int inputPicture)
    {
        buttonArray[buttonNumber].setPicture(inputPicture);
    }
    public int getPictureChoice(int buttonNumber)
    {
        return buttonArray[buttonNumber].getPicture();
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
    public void setColorChoice(int color_input) {
      colorChoice = color_input;
    }
    public int getColorChoice() {
        return colorChoice;
    }
    public void setFontChoice(int font_input) {
       fontChoice = font_input;
    }
    public int getFontChoice() {
        return fontChoice;
    }
    

}
