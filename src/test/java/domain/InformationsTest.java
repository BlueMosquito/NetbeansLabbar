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
import records.informationsRecord;

/**
 *
 * @author hamednajafi
 */
public class InformationsTest {
    
    public InformationsTest() {
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
     * Test of getGameId method, of class Informations.
     */
    @Test
    public void testGetGameId() {
        DbConn.getInstance().open();
        System.out.println("getGameId");
        
        informationsRecord informationMock = mock(informationsRecord.class);
        when(informationMock.getInteger("game_id")). thenReturn( null );
        Informations instance = new Informations(informationMock);
        
        Integer expResult = null;
        Integer result = instance.getGameId();
        assertEquals(expResult, result);
        
        verify( informationMock, times( 1 )) .getInteger("game_id");
        
        DbConn.getInstance().close();
    }

    /**
     * Test of getPlaceName method, of class Informations.
     */
    @Test
    public void testGetPlaceName() {
        DbConn.getInstance().open();
        System.out.println("getPlaceName");
        
        informationsRecord informationMock = mock(informationsRecord.class);
        when(informationMock.getString("place")). thenReturn( "" );
        
        Informations instance = new Informations(informationMock);
        String expResult = "";
        String result = instance.getPlaceName();
        assertEquals(expResult, result);
        
        verify( informationMock, times( 1 )) .getString("place");
        
        DbConn.getInstance().close();
    }

    /**
     * Test of getArenaName method, of class Informations.
     */
    @Test
    public void testGetArenaName() {
        DbConn.getInstance().open();
        System.out.println("getArenaName");
        
        informationsRecord informationMock = mock(informationsRecord.class);
        when(informationMock.getString("arena")). thenReturn( "" );
        
        Informations instance = new Informations(informationMock);
        String expResult = "";
        String result = instance.getArenaName();
        assertEquals(expResult, result);
        
        verify( informationMock, times( 1 )) .getString("arena");
        
        DbConn.getInstance().close();
    }
    
}
