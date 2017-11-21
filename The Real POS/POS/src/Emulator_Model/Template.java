/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emulator_Model;

/**
 * Holds our data model at the higher level. The buttons are stored as an array.
 *
 * @author Team 8
 */
public class Template {

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
    public void editButton(int buttonNumber, String inputName, double inputPrince, int inputPicture) {
        buttonArray[buttonNumber].setName(inputName);
        buttonArray[buttonNumber].setPrice(inputPrince);
        buttonArray[buttonNumber].setPicture(inputPicture);
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
