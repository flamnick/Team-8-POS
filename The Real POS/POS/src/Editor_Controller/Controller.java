/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Controller;

import Editor_Gui.Editor_Visual_2;
import Emulator_Model.Template;

/**
 *
 * @author j_haw
 */
public class Controller implements Observer
{
    
public Controller()
{
Template userModel = new Template();
Editor_Visual_2 userView = new Editor_Visual_2();

userView.setVisible(true);
}


}
