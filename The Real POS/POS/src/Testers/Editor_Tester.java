/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;

import java.awt.GraphicsEnvironment;

/**
 *
 * @author Flamnick
 */
public class Editor_Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String fonts[]
        = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String font : fonts) {
            System.out.println(font);
        }
    }
}
