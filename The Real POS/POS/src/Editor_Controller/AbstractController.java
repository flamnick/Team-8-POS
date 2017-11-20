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

/**
 *
 * @author Computer
 */
public abstract class AbstractController implements PropertyChangeListener
{
   // private ArrayList<abstractviewpanel> registeredViews;
    //private ArrayList<abstractmodel> registeredModels;
    
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
    
    protected void setModelProperty(String propertyName, Object newValue)
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
