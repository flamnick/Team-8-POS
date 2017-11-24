/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Model;

import Editor_Model.ImagePanel;
import java.util.Observable;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * This class is the button class for the editor.
 *
 * @author Team 8
 */
public class Button extends Observable {

    
    
    private ImageIcon coffee_icon;
    private ImageIcon beer_icon;
    private ImageIcon bread_icon;
    private ImageIcon cookie_icon;
    private ImageIcon strawberry_icon;
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
    private ImageIcon picture_select = null;
    
    /**
     * Standard Constructor
     */
    
            
    public Button() {
        this.setName(" ");
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
    public void setName(String inputName) 
    {
        name = inputName;
        setChanged();
        this.notifyObservers();
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
      
       try {
            coffee_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Coffee_new.png")));
            
                    
        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            beer_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Beer_new.png")));
                    
        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            bread_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Bread_new.png")));
                    
        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            cookie_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Cookie_new.png")));
                    
        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            strawberry_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Strawberry_new.png")));
                    
        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        } 
        
      switch (picture_input)
      {
          
          case 0: 
          {
              picture_select=null;
              break;
          }
          case 1: 
          {
              picture_select=coffee_icon;
              break;
          }
          case 2: 
          {
              picture_select=beer_icon;
              break;
          }
          case 3: 
          {
              picture_select=bread_icon;
              break;
          }
          case 4: 
          {
              picture_select=strawberry_icon;
              break;
          }
          case 5: 
          {
              picture_select=cookie_icon;
              break;
          }
          default:
          {
              picture_select=null;
              break;
          }
          
      }
          
    }
    public ImageIcon getPicture() 
    {
        
        return picture_select;
    }
    
}
