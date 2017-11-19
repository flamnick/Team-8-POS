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
<<<<<<< HEAD
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
=======
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyOberver();
>>>>>>> 8eb3b312f8f73de8918683deeb4b0392fbf700ca
}
