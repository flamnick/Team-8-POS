/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emulator_Model;

/**
 *
 * @author Team 8
 */
public class Calculator {

    /**
     * calculate_sum will get the sum of a passed array of doubles
     *
     * @param total takes in the array of values passed from DataHolder
     * @return the sum of the contents of the total array
     */
    double calculate_sum(double total[]) {

        double sum = 0;

        for (int i = 0; i < total.length; i++) {
            sum += total[i];
        }

        return sum;
    }

    /**
     * calculate_taxed_total calculates the data holder total and and adds tax
     *
     * @param sum takes in sum calculated in calculate_sum()
     * @param tax_rate takes in tax rate from current template
     * @return the total with applied tax rate
     */
    double calculate_taxed_total(double sum, double tax_rate) {

        double taxed_total = 0;

        taxed_total = (sum * tax_rate) + sum;

        return taxed_total;
    }
}
