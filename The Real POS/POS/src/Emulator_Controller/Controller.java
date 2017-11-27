/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emulator_Controller;

/**
 *
 * @author Computer
 */
public class Controller 
{
   public Controller()
   {
    Model.Template POSmodel = new Model.Template();
    Emulator_Gui.Emulator_Visual view = new Emulator_Gui.Emulator_Visual(POSmodel);
    view.setVisible(true);  
   }
}
