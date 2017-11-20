/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Controller;
import Editor_Model.AbstractModel;
import java.beans.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import Editor_Gui.*;
import Editor_Model.*;

/**
 *
 * @author Computer
 */
public abstract class AbstractController implements PropertyChangeListener
{
<<<<<<< HEAD
   // private ArrayList<abstractviewpanel> registeredViews;
    //private ArrayList<abstractmodel> registeredModels;
=======
    private ArrayList<abstractviewpanel> registeredViews;
    private ArrayList<AbstractModel> registeredModels;
>>>>>>> 40979d9fae0898a1b920a0a2ae6837eec297cacd
    
    public AbstractController()
    {
       // registeredViews = new ArrayList<abstractviewpanel>();
       // registeredModels = new ArrayList<AbstractModel>();
    }
    
    public void addModel(AbstractModel model)
    {
       // registeredModels.add(model);
        model.addPropertyChangeListener(this);
    }
    //public void addView(AbstractViewPanel view)
    {
        //registeredViews.add(view);
    }
    //public void removeView(AbstractViewPanel view)
    {
        //registeredViews.remove(view);
    }
    
    public void propertyChange(PropertyChangeEvent evt)
    {
        //for (AbstractViewPanel view: registeredViews)
        {
           // view.modelPropertyChange(evt);
        }
    }
    
    protected void setModelProperty(String propertyName, int buttonName, Object newValue)
    {
        //for (AbstractModel model: registeredModels)
        {
            try
            {
              //  Method method = model.getClass().getMethod("set"+propertyName, new Class[] {newValue.getClass()});
                        {
                //          method.invoke(model, newValue);  
                        }
            }
            catch (Exception ex)
            {
                
            }
        }
    }
}
