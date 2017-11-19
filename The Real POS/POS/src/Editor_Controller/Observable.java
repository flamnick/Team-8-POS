/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Controller;
import java.util.Observer;

/**
 *
 * @author Computer
 */
public interface Observable 
{
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
