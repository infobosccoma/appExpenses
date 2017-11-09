/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexpenses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miquel
 */
public class CurrentAccountTest {
    
    public CurrentAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

        
    @Test
    public void testSuficient() {
        System.out.println("Enough");
        Expenses desp;
        double[] d = {10,300,150};
        desp = new Expenses(d); 
        
        CurrentAccount instance = new CurrentAccount("AccountNumber",1000);
        assertEquals(true, instance.suficient(desp));
    }
    
    
     /**
     * There's enough money in current account . Account remaining import = 0
     */
    
    @Test
    public void testJust() {
        System.out.println("Remains 0");
        Expenses desp;
        double[] d = {10,300,150};
        desp = new Expenses(d); 
        
        CurrentAccount instance = new CurrentAccount("AccountNumber",460);
        assertEquals(true, instance.suficient(desp));
    }

     /**
     * There's not enough money in current account
     */
    
    @Test
    public void testInsuficient() {
        System.out.println("Insufficient");
        Expenses desp;
        double[] d = {10,300,150};
        desp = new Expenses(d); 
        
        CurrentAccount instance = new CurrentAccount("AccountNumber",400);
        assertEquals(false, instance.suficient(desp));
    }    

    
}
