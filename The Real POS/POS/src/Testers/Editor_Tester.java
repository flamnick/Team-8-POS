/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;

/**
 *
 * @author Flamnick
 */
public class Editor_Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editor_Model.Template test = new Editor_Model.Template();
        test.setName(1, "Pizza");
        System.out.println(test.getName(1));
        test = new Editor_Model.Template();
        System.out.println(test.getName(1));
    }
    
}
