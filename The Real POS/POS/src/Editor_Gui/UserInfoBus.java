/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;
import java.awt.Color;
import java.awt.Font;
import java.beans.*;

/**
 * The class which contains our user info.
 * @author Team 8
 */
public class UserInfoBus 
{
   private String name;
   private double price;
   private Color color;
   private int picture;
   private Font font;
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
       price=userDouble;
   }
   /**
    * Gets the double within the object.
    * @return userDouble
    */
   public double getPrice()
   {
       return price;
   }  
   public void setColor(Color userColor)
   {
       color=userColor;
   }
   /**
    * Gets the double within the object.
    * @return userDouble
    */
   public Color getColor()
   {
       return color;
   }  
   
   /**
    * Sets name in object
    * @param inputPicture takes user picture choice 
    */
   public void setPicture(int inputPicture)
   {
       
       picture=inputPicture;
      
   }
   
   /**
    * Gets name field in object.
    * @return name
    */
   public int getPicture ()
   {
       return picture;
   }
   
      public void setFont(Font inputFont)
   {
       font=inputFont;
   }
   
   /**
    * Gets name field in object.
    * @return name
    */
   public Font getFont ()
   {
       return font;
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
