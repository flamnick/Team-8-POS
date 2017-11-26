/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Flamnick
 */
public class setPic {

    private ImageIcon coffee_icon;
    private ImageIcon beer_icon;
    private ImageIcon bread_icon;
    private ImageIcon cookie_icon;
    private ImageIcon strawberry_icon;

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
