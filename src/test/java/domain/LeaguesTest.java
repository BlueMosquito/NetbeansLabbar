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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import records.LeaguesRecord;

/**
 *
 * @author hamednajafi
 */
public class LeaguesTest {
    
    public LeaguesTest() {
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
     * Test of getName method, of class Leagues.
     */
    @Test
    public void testGetName() {
        DbConn.getInstance().open();
        System.out.println("getName");
        LeaguesRecord leaguesMock = mock(LeaguesRecord.class);
        when(leaguesMock.getString("leagueName")). thenReturn( "" );
        
        Leagues instance = new Leagues(leaguesMock);
        
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        verify( leaguesMock, times( 1 )) .getString("leagueName");
        
        DbConn.getInstance().close();
    }
    
}
