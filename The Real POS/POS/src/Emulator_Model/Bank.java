/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emulator_Model;

/**
 *
 * @author Group 8
 */
public class Bank {

    private double cash;

    /**
     * This is a constructor to instantiate the Bank class
     */
    public Bank() {

    }

    /**
     * setCash sets the cash variable
     *
     * @param cash_input this is the initial amount of cash the user puts in the
     * register when loading a new template
     */
    public void setCash(double cash_input) {
        cash = cash_input;
    }

    /**
     * getCash returns the public cash variable
     *
     * @return cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * addCash adds a double to the public cash variable
     *
     * @param added_cash takes in the added cash after a user totals a
     * transactions
     */
    public void addCash(double added_cash) {
        cash += added_cash;
    }

}
