/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ImagePanel;
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
    private int picture;

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
     * @param pictureInput Picture chosen by user.
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

    public void setPicture(int picture_input) {

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
            strawberry_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Fruit_new.png")));

        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }

        switch (picture_input) {

            case 0: {
                picture = 0;
                break;
            }
            case 1: {
                picture = 1;
                break;
            }
            case 2: {
                picture = 2;
                break;
            }
            case 3: {
                picture = 3;
                break;
            }
            case 4: {
                picture = 4;
                break;
            }
            case 5: {
                picture = 5;
                break;
            }
            default: {
                picture = 0;
                break;
            }

        }

    }

    public int getPicture() {

        return picture;
    }

}
