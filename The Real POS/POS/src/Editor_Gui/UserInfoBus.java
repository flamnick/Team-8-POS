/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;

/**
 * THe class which contains our user info.
 * @author Team 8
 */
public class UserInfoBus 
{
   private String name;
   private Double price;
    
   /**
    * Sets name in object
    * @param userString takes user string 
    */
   void setName(String userString)
   {
       name=userString;
   }
   
   /**
    * Gets name field in object.
    * @return name
    */
   String getName ()
   {
       return name;
   }
   
   /**
    * sets price in object.
    * @param userDouble takes user price.
    */
   void setPrice(double userDouble)
   {
       price=userDouble;
   }
   /**
    * Gets the double within the object.
    * @return userDouble
    */
   double getPrice()
   {
       return price;
   }    
}
