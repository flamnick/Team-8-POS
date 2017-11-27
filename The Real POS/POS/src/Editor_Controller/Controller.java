/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Controller;
import Editor_Gui.Editor_Visual;
import Model.Template;
       

/**
 * This is simply the controller for our class. It's only job is to instantiate our model and our view and set it to visible.
 * @author Computer
 */
public class Controller 
{
 public Controller()
 {
    Model.Template POSmodel = new Model.Template();
    Editor_Gui.Editor_Visual view = new Editor_Gui.Editor_Visual(POSmodel);
    view.setVisible(true);
 }
    
}
