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
public class AppExpenses {
    public static void main(String[] args) {
        Expenses desp;
        double[] d={100,200,50};
        
        desp = new Expenses(d); 
        CurrentAccount cc=new CurrentAccount("numcompte",1000);
        System.out.println(cc.suficient(desp));
    }    
}