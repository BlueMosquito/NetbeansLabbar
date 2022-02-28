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
import records.gamesRecord;

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
        
        gamesRecord gameMock = mock(gamesRecord.class);
        when(gameMock.getInteger("season_id")). thenReturn( null );
        
        Games instance = new Games(gameMock);
        Integer expResult = null;
        Integer result = instance.getSeason();
        assertEquals(expResult, result);
        
        verify( gameMock, times( 1 )) .getInteger("season_id");
        
        DbConn.getInstance().close();
    }

    /**
     * Test of getGameName method, of class Games.
     */
    @Test
    public void testGetGameName() {
        DbConn.getInstance().open();
        System.out.println("getGameName");
        
        gamesRecord gameMock = mock(gamesRecord.class);
        when(gameMock.getString("gameName")). thenReturn( "" );
        
        Games instance = new Games(gameMock);
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        
        verify( gameMock, times( 1 )) .getString("gameName");
        
        DbConn.getInstance().close();
    }
    
}
