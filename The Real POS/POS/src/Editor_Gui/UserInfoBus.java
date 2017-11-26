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
 * The class which contains our user info.
 *
 * @author Team 8
 */
public class UserInfoBus {

    private String name;
    private double price;
    private Color color;
    private int picture;
    private Font font;
    private PropertyChangeSupport mPcs = new PropertyChangeSupport(this);

    /**
     * Sets name in object
     *
     * @param userString takes user string
     */
    public void setName(String userString) {
        String oldName = name;
        name = userString;
        mPcs.firePropertyChange("", oldName, userString);
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

    /**
     * @param
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        mPcs.addPropertyChangeListener(listener);
    }

    /**
     * @param
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        mPcs.removePropertyChangeListener(listener);
    }
}
