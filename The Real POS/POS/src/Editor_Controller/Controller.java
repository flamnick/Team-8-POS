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
 * @author Ian Prince
 */
public class Controller extends AbstractController
{
public static final String BUTTON_NAME_PROPERTY = "Name";
public static final String BUTTON_PRICE_PROPERTY = "Price";

public void changeElementName(String newText)
{
    setModelProperty(BUTTON_NAME_PROPERTY, newText);
}

public void changeElementPrice(double newPrice)
{
    setModelProperty(BUTTON_PRICE_PROPERTY, newPrice);
}

}
