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
    public static void main(String[] args) throws Exception {
        Editor_Model.Template test = new Editor_Model.Template();
        Editor_Model.XMLManager tester = new Editor_Model.XMLManager();
        test.setName(1,"Namae");
        tester.write(test, "poopybutthole.xml");
        Editor_Model.Template pbh2 = tester.read("poopybutthole.xml");
        System.out.println(pbh2.getName(1));
    }
}
