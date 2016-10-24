/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtopics.JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbrinkerhoff
 */
public class PrintAgeTest {
    
    public PrintAgeTest() {
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

    /**
     * Test of print method, of class PrintAge.
     */
    @Test
    public void testPrint() {
        System.out.println("We are testing the Print Age method");
        int age = 0;
        PrintAge instance = new PrintAge();
        String expResult = "You must be a baby!";
        String result = instance.print(age);
        assertEquals(expResult, result);
        
    }
    
}
