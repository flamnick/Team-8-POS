/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;

import java.awt.Color;
import java.awt.Font;
import java.beans.*;

/**
 * The information bus which provides a convenient method of shuttling changes to the model.
 *
 * @author Team 8
 */
public class UserInfoBus {

    /**
     * This contains the name for our info bus.
     */
    private String name;
    /**
     * Contains the price value for our info bus.
     */
    private double price;
    /**
     * Contains the color value for our info bus. Might not use
     */
    private Color color;
    /**
     * Contains the picture selector integer flag for our info bus
     */
    private int picture;
    /**
     * Contains the font for this individual button. Might not use.
     */
    private Font font;

    /**
     * Sets name in object
     *
     * @param userString takes user string
     */
    public void setName(String userString) {
        name = userString;
    }

    /**
     * Gets name field in object.
     *
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     * sets price in object.
     *
     * @param userDouble takes user price.
     */
    public void setPrice(double userDouble) {
        price = userDouble;
    }

    /**
     * Gets the price within the object.
     *
     * @return double price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets color within the object.
     *
     * @param userColor is the color object from the user selection
     */
    public void setColor(Color userColor) {
        color = userColor;
    }

    /**
     * Gets the color of the object
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets picture in object
     *
     * @param inputPicture takes user picture choice
     */
    public void setPicture(int inputPicture) {

        picture = inputPicture;

    }

    /**
     * Gets name field in object.
     *
     * @return integer picture choice from switch statement.
     */
    public int getPicture() {
        return picture;
    }

    /**
     * Sets object font
     *
     * @param inputFont is the Font object from the switch statement in Color
     * Dialogue Box.
     */
    public void setFont(Font inputFont) {
        font = inputFont;
    }

    /**
     * Gets font in object
     *
     * @return font
     */
    public Font getFont() {
        return font;
    }

}
