/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Editor_Gui.*;
import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

import java.util.Observable;
import javax.swing.ImageIcon;
import javax.swing.UIManager;





/**
 * Holds our data model at the higher level. The buttons are stored as an array.
 *
 * @author Team 8
 */
public class Template extends Observable implements Serializable
{
    /**
     * This is simply an array which holds our button data.
     */
    private Button[] buttonArray;
    private double taxRate;
    private Color colorSetting;
    private Font fontSetting;
    

    
    public Template()
    {
        
    }
    
    
    /**
     * Sets aside space in memory for 10 button objects, and makes those
     * objects.
     */
    public void initTemplate() {
        buttonArray = new Button[21];
        

        for (int i = 0; i < 20; i++) 
        {
            buttonArray[i] = new Button();
        }
        //This code sets up the text to start bold.
        this.fontSetting = new Font("Tahoma", Font.BOLD, 14);
        setChanged();
        this.notifyObservers();
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
     * This updates our entire button with the contents of our data holder.
     * @param buttonNumber
     * @param dataHolder 
     */
    public void updateButton(int buttonNumber, Editor_Gui.UserInfoBus dataHolder)
    {
        buttonArray[buttonNumber].setName(dataHolder.getName());
        setChanged();
        this.notifyObservers();
        buttonArray[buttonNumber].setPrice(dataHolder.getPrice());
        setChanged();
        this.notifyObservers();
        
        buttonArray[buttonNumber].setPicture(dataHolder.getPicture());
        setChanged();
        this.notifyObservers();
    }
    
    /**
     * This updates our data model with the users chosen font and color.
     * @param colorChoice
     * @param fontChoice 
     */
    public void updateTemplateAppearance(Color colorChoice, Font fontChoice)
    {
        this.colorSetting = colorChoice;
        setChanged();
        this.notifyObservers();
        
        this.fontSetting = fontChoice;
        setChanged();
        this.notifyObservers();
    }
    /**
     * This changes the name field of a particular button and fires a
     * property change informing the controller. There for the purpose of possibly
     * adding a change name only property.
     * @param buttonNumber the button whose name we are replacing.
     * @param inputName the name we are replacing the button name field with.
     */
    public void setName(int buttonNumber, String inputName)
    {
      buttonArray[buttonNumber].setName(inputName);
      setChanged();
      this.notifyObservers();
    }
    
    /**
     * This gets the name from a particular button. Useful if we eventually intend to edit
     * the thing individually.
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
      setChanged();
      this.notifyObservers();
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
    
    
    /**
     * Method for setting the picture choice.
     * @param buttonNumber
     * @param inputPicture 
     */
    public void setPictureChoice(int buttonNumber, int inputPicture)
    {
        buttonArray[buttonNumber].setPicture(inputPicture);
        setChanged();
        this.notifyObservers();
        
    }
  
    /**
     * Method for getting picture Choice.
     * @param buttonNumber Whichever button we are editing.
     * @return 
     */
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
        setChanged();
        this.notifyObservers();
    }

    /**
     * Method for getting tax rate.
     *
     * @return taxRate;
     */
    public double getTaxRate() {
        return taxRate;
    }
    public void setColorChoice(Color color_input) {
      colorSetting = color_input;
      setChanged();
      this.notifyObservers();
    }
    public Color getColorChoice() {
        return colorSetting;
    }
    public void setFontChoice(Font font_input) 
    {
       fontSetting = font_input;
       setChanged();
       this.notifyObservers();
    }
    public Font getFontChoice() 
    {
        return fontSetting;
    }
    
    public Button[] getButton()
    {
        return buttonArray;
    }
    public void setButton(Button[] arrayToCopy)
    {
        buttonArray = arrayToCopy;
    }
    
    /**
     * This method clears the template back to defaults.
     */
    public void resetTemplate()
    {
        for (int i = 0; i < 20; i++) 
        {
        this.buttonArray[i].setName(" ");
        this.buttonArray[i].setPrice(0.0);
        this.buttonArray[i].setPicture(0);
        }
        this.fontSetting = new Font("Tahoma", Font.BOLD, 14);
        this.colorSetting = Color.MAGENTA;
        setChanged();
        this.notifyObservers();
    }
}
