/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Controller;
import java.util.Observable;

/**
 *
 * @author Team 8
 */
public interface Observer 
{
    //I need to figure out what to put in here for a parameter.
    public void update(Observable o, Object arg);
}