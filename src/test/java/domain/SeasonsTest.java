/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package domain;

import db.DbConn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hamednajafi
 */
public class SeasonsTest {
    
    public SeasonsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Seasons.
     */
    @Test
    public void testGetName() {
        DbConn.getInstance().open();
        System.out.println("getName");
        Seasons instance = new Seasons();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        DbConn._close();
    }

    /**
     * Test of getLeagueId method, of class Seasons.
     */
    @Test
    public void testGetLeagueId() {
        DbConn.getInstance().open();
        System.out.println("getLeagueId");
        Seasons instance = new Seasons();
        Integer expResult = null;
        Integer result = instance.getLeagueId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        DbConn._close();
    }
    
}
