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
public class GamesTest {
    
    public GamesTest() {
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
     * Test of getSeason method, of class Games.
     */
    @Test
    public void testGetSeason() {
        DbConn.getInstance().open();
        System.out.println("getSeason");
        Games instance = new Games();
        Integer expResult = null;
        Integer result = instance.getSeason();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        DbConn._close();
    }

    /**
     * Test of getGameName method, of class Games.
     */
    @Test
    public void testGetGameName() {
        DbConn.getInstance().open();
        System.out.println("getGameName");
        Games instance = new Games();
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        DbConn._close();
    }
    
}
