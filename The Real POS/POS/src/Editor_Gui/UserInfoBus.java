/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;
import java.beans.*;

/**
 * THe class which contains our user info.
 * @author Team 8
 */
public class UserInfoBus 
{
   private String name;
   private Double price;
   private int picture;
   private PropertyChangeSupport mPcs = new PropertyChangeSupport(this);
    
   /**
    * Sets name in object
    * @param userString takes user string 
    */
   public void setName(String userString)
   {
       String oldName = name;
       name=userString;
       mPcs.firePropertyChange("", oldName, userString);
   }
   
   /**
    * Gets name field in object.
    * @return name
    */
   public String getName ()
   {
       return name;
   }
   
   /**
    * sets price in object.
    * @param userDouble takes user price.
    */
   public void setPrice(double userDouble)
   {
       double oldPrice = price;
       price=userDouble;
       mPcs.firePropertyChange("price", oldPrice, userDouble);
   }
   /**
    * Gets the double within the object.
    * @return userDouble
    */
   public double getPrice()
   {
       return price;
   }  
   
   /**
    * Sets name in object
    * @param userString takes user string 
    */
   void setPicture(int inputPicture)
   {
       int oldPicture = picture;
       picture=inputPicture;
       mPcs.firePropertyChange("", oldPicture, picture);
   }
   
   /**
    * Gets name field in object.
    * @return name
    */
   int getPicture ()
   {
       return picture;
   }
   
   public void addPropertyChangeListener(PropertyChangeListener listener)
           {
               mPcs.addPropertyChangeListener(listener);
           }
   public void removePropertyChangeListener (PropertyChangeListener listener)
   {
       mPcs.removePropertyChangeListener(listener);
   }
}
