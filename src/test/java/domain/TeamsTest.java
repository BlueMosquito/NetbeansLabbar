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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import records.TeamsRecord;

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
        
        TeamsRecord teamMock = mock(TeamsRecord.class);
        when(teamMock.getInteger("g_id")). thenReturn( null );
        
        Teams instance = new Teams(teamMock);
        Integer expResult = null;
        Integer result = instance.getGameId();
        
        verify( teamMock, times( 1 )) .getInteger("g_id");
        
        DbConn.getInstance().close();
    }

    /**
     * Test of getTeamName method, of class Teams.
     */
    @Test
    public void testGetTeamName() {
        DbConn.getInstance().open();
        System.out.println("getTeamName");
        
        TeamsRecord teamMock = mock(TeamsRecord.class);
        when(teamMock.getString("teamName")). thenReturn( "" );
        
        Teams instance = new Teams(teamMock);
        String expResult = "";
        String result = instance.getTeamName();
        
        verify( teamMock, times( 1 )) .getString("teamName");
        
        DbConn.getInstance().close();
    }
    
}
