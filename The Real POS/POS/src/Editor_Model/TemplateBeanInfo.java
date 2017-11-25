/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Model;

import java.beans.*;

/**
 *
 * @author Computer
 */
public class TemplateBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( Editor_Model.Template.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_button = 0;
    private static final int PROPERTY_colorChoice = 1;
    private static final int PROPERTY_fontChoice = 2;
    private static final int PROPERTY_name = 3;
    private static final int PROPERTY_pictureChoice = 4;
    private static final int PROPERTY_price = 5;
    private static final int PROPERTY_taxRate = 6;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[7];
    
        try {
            properties[PROPERTY_button] = new PropertyDescriptor ( "button", Editor_Model.Template.class, "getButton", "setButton" ); // NOI18N
            properties[PROPERTY_colorChoice] = new PropertyDescriptor ( "colorChoice", Editor_Model.Template.class, "getColorChoice", "setColorChoice" ); // NOI18N
            properties[PROPERTY_fontChoice] = new PropertyDescriptor ( "fontChoice", Editor_Model.Template.class, "getFontChoice", "setFontChoice" ); // NOI18N
            properties[PROPERTY_name] = new IndexedPropertyDescriptor ( "name", Editor_Model.Template.class, null, null, "getName", "setName" ); // NOI18N
            properties[PROPERTY_pictureChoice] = new IndexedPropertyDescriptor ( "pictureChoice", Editor_Model.Template.class, null, null, "getPictureChoice", null ); // NOI18N
            properties[PROPERTY_price] = new IndexedPropertyDescriptor ( "price", Editor_Model.Template.class, null, null, "getPrice", "setPrice" ); // NOI18N
            properties[PROPERTY_taxRate] = new PropertyDescriptor ( "taxRate", Editor_Model.Template.class, "getTaxRate", "setTaxRate" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_addObserver0 = 0;
    private static final int METHOD_countObservers1 = 1;
    private static final int METHOD_deleteObserver2 = 2;
    private static final int METHOD_deleteObservers3 = 3;
    private static final int METHOD_editButton4 = 4;
    private static final int METHOD_hasChanged5 = 5;
    private static final int METHOD_notifyObservers6 = 6;
    private static final int METHOD_notifyObservers7 = 7;
    private static final int METHOD_setPictureChoice8 = 8;
    private static final int METHOD_setPictureChoice9 = 9;
    private static final int METHOD_updateButton10 = 10;
    private static final int METHOD_updateTemplateAppearance11 = 11;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[12];
    
        try {
            methods[METHOD_addObserver0] = new MethodDescriptor(java.util.Observable.class.getMethod("addObserver", new Class[] {java.util.Observer.class})); // NOI18N
            methods[METHOD_addObserver0].setDisplayName ( "" );
            methods[METHOD_countObservers1] = new MethodDescriptor(java.util.Observable.class.getMethod("countObservers", new Class[] {})); // NOI18N
            methods[METHOD_countObservers1].setDisplayName ( "" );
            methods[METHOD_deleteObserver2] = new MethodDescriptor(java.util.Observable.class.getMethod("deleteObserver", new Class[] {java.util.Observer.class})); // NOI18N
            methods[METHOD_deleteObserver2].setDisplayName ( "" );
            methods[METHOD_deleteObservers3] = new MethodDescriptor(java.util.Observable.class.getMethod("deleteObservers", new Class[] {})); // NOI18N
            methods[METHOD_deleteObservers3].setDisplayName ( "" );
            methods[METHOD_editButton4] = new MethodDescriptor(Editor_Model.Template.class.getMethod("editButton", new Class[] {int.class, java.lang.String.class, double.class, int.class})); // NOI18N
            methods[METHOD_editButton4].setDisplayName ( "" );
            methods[METHOD_hasChanged5] = new MethodDescriptor(java.util.Observable.class.getMethod("hasChanged", new Class[] {})); // NOI18N
            methods[METHOD_hasChanged5].setDisplayName ( "" );
            methods[METHOD_notifyObservers6] = new MethodDescriptor(java.util.Observable.class.getMethod("notifyObservers", new Class[] {})); // NOI18N
            methods[METHOD_notifyObservers6].setDisplayName ( "" );
            methods[METHOD_notifyObservers7] = new MethodDescriptor(java.util.Observable.class.getMethod("notifyObservers", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_notifyObservers7].setDisplayName ( "" );
            methods[METHOD_setPictureChoice8] = new MethodDescriptor(Editor_Model.Template.class.getMethod("setPictureChoice", new Class[] {int.class, javax.swing.ImageIcon.class})); // NOI18N
            methods[METHOD_setPictureChoice8].setDisplayName ( "" );
            methods[METHOD_setPictureChoice9] = new MethodDescriptor(Editor_Model.Template.class.getMethod("setPictureChoice", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_setPictureChoice9].setDisplayName ( "" );
            methods[METHOD_updateButton10] = new MethodDescriptor(Editor_Model.Template.class.getMethod("updateButton", new Class[] {int.class, Editor_Gui.UserInfoBus.class})); // NOI18N
            methods[METHOD_updateButton10].setDisplayName ( "" );
            methods[METHOD_updateTemplateAppearance11] = new MethodDescriptor(Editor_Model.Template.class.getMethod("updateTemplateAppearance", new Class[] {java.awt.Color.class, java.awt.Font.class})); // NOI18N
            methods[METHOD_updateTemplateAppearance11].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
