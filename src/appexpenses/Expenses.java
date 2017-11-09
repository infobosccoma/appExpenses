/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexpenses;

/**
 *
 * @author miquel
 */
public class Expenses {
    private double[] expenses;
    
    public Expenses(double[] expenses) {
        this.expenses = expenses;
    }
    
    public double total() {
        double total=0;
        for(int i=0;i<expenses.length;i++) total += expenses[i];
        return total;
    }

}
