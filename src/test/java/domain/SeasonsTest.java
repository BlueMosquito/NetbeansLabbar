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
import records.SeasonsRecord;

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
        
        SeasonsRecord seasonMock = mock(SeasonsRecord.class);
        when(seasonMock.getString("seasonName")). thenReturn( "" );
        Seasons instance = new Seasons(seasonMock);
        
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        verify( seasonMock, times( 1 )) .getString("seasonName");
        
        DbConn.getInstance().close();
    }

    /**
     * Test of getLeagueId method, of class Seasons.
     */
    @Test
    public void testGetLeagueId() {
        DbConn.getInstance().open();
        System.out.println("getLeagueId");
        
        SeasonsRecord seasonMock = mock(SeasonsRecord.class);
        when(seasonMock.getInteger("league_id")). thenReturn( null );
        
        Seasons instance = new Seasons(seasonMock);
        
        Integer expResult = null;
        Integer result = instance.getLeagueId();
        assertEquals(expResult, result);
        
        verify( seasonMock, times( 1 )) .getInteger("league_id");
        
        DbConn.getInstance().close();
    }
    
}
