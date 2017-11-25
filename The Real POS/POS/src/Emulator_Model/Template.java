/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emulator_Model;

import java.awt.Color;
import java.awt.Font;
import java.util.Observable;
import javax.swing.ImageIcon;

/**
 * Holds our data model at the higher level. The buttons are stored as an array.
 *
 * @author Team 8
 */
public class Template extends Observable {
    /**
     * This is simply an array which holds our button data.
     */
    private Editor_Model.Button[] buttonArray;
    /**
     * This is a double which holds our tax rate.
     */
    private double taxRate;
    /**
     * This is a Color object which holds the current choice for the view to display.
     */
    private Color colorSetting;
    /**
     * This is a Font object which holds the current choice for the view to display;
     */
    private Font fontSetting;

    /**
     * Sets aside space in memory for 10 button objects, and makes those
     * objects.
     */
    public Template() {
        colorSetting = Color.CYAN;
        buttonArray = new Editor_Model.Button[21];

        for (int i = 0; i < 20; i++) 
        {
            buttonArray[i] = new Editor_Model.Button();
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
    
    public void setPictureChoice(int buttonNumber, int inputPicture)
    {
        buttonArray[buttonNumber].setPicture(inputPicture);
    }
    public ImageIcon getPictureChoice(int buttonNumber)
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
    public void setColorChoice(Color color_input) {
      colorSetting = color_input;
      setChanged();
      this.notifyObservers();
    }
    public Color getColorChoice() {
        return colorSetting;
    }
    public void setFontChoice(Font font_input) {
       fontSetting = font_input;
       setChanged();
       this.notifyObservers();
    }
    public Font getFontChoice() {
        return fontSetting;
    }
    public Editor_Model.Button[] getButton()
    {
        return buttonArray;
    }
    public void setButton(Editor_Model.Button[] arrayToCopy)
    {
        buttonArray = arrayToCopy;
    }
}
