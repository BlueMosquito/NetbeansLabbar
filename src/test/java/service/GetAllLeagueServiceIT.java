/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package service;

import domain.Leagues;
import java.util.List;
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
public class GetAllLeagueServiceIT {
    
    public GetAllLeagueServiceIT() {
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
     * Test of execute method, of class GetAllLeagueService.
     */
    @Test
    public void testExecute() {
        ServiceRunner<List<Leagues>> runner = new ServiceRunner<>(new GetAllLeagueService());
        List<Leagues> leaguesList = runner.execute();
        assertEquals(leaguesList.get(0).getName(), "LeagueNr1");
    }
    
}
