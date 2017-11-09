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
public class CurrentAccount {

    private String ccnum;
    private double importc;

    public CurrentAccount(String ccnum, double importc) {
        this.ccnum = ccnum;
        this.importc = importc;
    }

    public boolean suficient(Expenses despeses) {
        double total;
        total = despeses.total();

        return total <= this.importc;
    }
}
