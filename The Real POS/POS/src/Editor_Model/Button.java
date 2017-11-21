/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Model;

/**
 * This class is the button class for the editor.
 *
 * @author Team 8
 */
public class Button {

    /**
     * This variable holds the price associated for the given button.
     */
    private double price;
    /**
     * This variable holds the title for the given button.
     */
    private String name;
    /**
     * This variable holds the int for selecting the button's picture
     */
    private int picture_select;
    
    /**
     * Standard Constructor
     */
    
            
    public Button() {
        this.setName("placeHolder");
        this.setPrice(0);
        this.setPicture(0);
    }

    /**
     * Parameterized constructor
     *
     * @param priceInput The price we're setting it to.
     * @param nameInput The name we're setting it to.
     */
    public Button(double priceInput, String nameInput, int pictureInput) {
        this.setName(nameInput);
        this.setPrice(priceInput);
        this.setPicture(pictureInput);
    }

    /**
     * Sets price associated with a button
     *
     * @param priceInput takes the price to be set.
     */
    public void setPrice(double priceInput) {
        price = priceInput;
    }

    /**
     * Gets the Price for the current button
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the name for the current button
     *
     * @param inputName String which the name is changing to.
     */
    public void setName(String inputName) {
        name = inputName;
    }

    /**
     * Gets the name associated with this button
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setPicture(int picture_input) 
    {
      picture_select = picture_input;
    }
    public int getPicture() 
    {
        return picture_select;
    }
    
}
