/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brinkerboss
 */
public class PrintAgeTest {

    private PrintAge instance;

    public class PrintAge {

        public String print(int age) {
            if (age > 50) {
                return "You're old!";
            } else if (age > 30) {
                return "You're young";
            } else if (age > 10) {
                return "You're just a child";
            } else {
                return "You must be a baby!";
            }
        }
    }

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
        this.instance = new PrintAge();
    }

    @After
    public void tearDown() {
        this.instance = null;
    }

    /**
     * Test of print method, of class PrintAge.
     */
    @Test
    public void testEquals() {
        System.out.println("Testing the assertEquals Method");

        assertEquals("You must be a baby!", this.instance.print(0));

    }

    @Test
    public void testNotEquals() {
        System.out.println("Testing the assertNotEquals method");

        assertNotEquals("You must be a baby!", this.instance.print(25));

    }

}
