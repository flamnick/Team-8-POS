/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emulator_Model;

import java.util.ArrayList;

/**
 *
 * @author Team 8
 */
public class DataHolder {

    private ArrayList<Double> values = new ArrayList();
    private ArrayList<String> names = new ArrayList();

    /**
     * This class will keep a running list of the buttons pressed so far
     */
    public DataHolder() {

    }

    /**
     * addButton stores a value and name for the button pressed
     *
     * @param input_value takes in the value of the selected button
     * @param input_name takes in the name of the selected button
     */
    public void addButton(double input_value, String input_name) {
        values.add(input_value);
        names.add(input_name);
    }

    /**
     * clearList clears the value and name ArrayList
     */
    public void clearList() {
        values.clear();
        names.clear();
    }

    /**
     * getValues returns the arrayList of values
     *
     * @return the arrayList holding the values
     */
    public ArrayList<Double> getValues() {
        return values;
    }

    /**
     * getNames returns the arrayList of names
     *
     * @return the arrayList holding the names
     */
    public ArrayList<String> getNames() {
        return names;
    }
}
