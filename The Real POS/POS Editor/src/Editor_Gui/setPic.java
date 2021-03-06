/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This class receives an integer, interprets it, and sends out a picture.
 *
 */
public class setPic {
    /**
     * Our coffee icon.
     */
    private ImageIcon coffee_icon;
    /**
     * Our beer icon.
     */
    private ImageIcon beer_icon;
    /**
     * Our bread icon.
     */
    private ImageIcon bread_icon;
    /**
     * Our cookie icon.
     */
    private ImageIcon cookie_icon;
    /**
     * Our strawberry icon.
     */
    private ImageIcon strawberry_icon;

    /**
     * Initializes all the images
     *
     */
    public setPic() {
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
    }

    /**
     * The integer is received here and the picture is set.
     *
     * @param value is the integer received
     * @return null
     */
    public ImageIcon getPic(int value) {
        switch (value) {
            case 0: {
                return null;
            }
            case 1: {
                return coffee_icon;
            }
            case 2: {
                return beer_icon;
            }
            case 3: {
                return bread_icon;
            }
            case 4: {
                return strawberry_icon;
            }
            case 5: {
                return cookie_icon;
            }

        }
        return null;
    }
}
