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
public class TeamsTest {
    
    public TeamsTest() {
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
     * Test of getGameId method, of class Teams.
     */
    @Test
    public void testGetGameId() {
        DbConn.getInstance().open();
        System.out.println("getGameId");
        Teams instance = new Teams();
        Integer expResult = null;
        Integer result = instance.getGameId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        DbConn._close();
    }

    /**
     * Test of getTeamName method, of class Teams.
     */
    @Test
    public void testGetTeamName() {
        DbConn.getInstance().open();
        System.out.println("getTeamName");
        Teams instance = new Teams();
        String expResult = "";
        String result = instance.getTeamName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        DbConn._close();
    }
    
}
