/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package service;

import broker.SeasonBroker;
import db.DbConn;
import domain.Seasons;
import exception.ExceptionClass;
import factory.BrokerFactory;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonTest {
    
    public GetAllSeasonTest() {
    }

    /**
     * Test of execute method, of class GetAllSeasonByLeagueIdService.
     */
    @Test
    public void testShouldAcceptExistingSeason() {
        GetAllSeasonService service = new GetAllSeasonService();
        BrokerFactory brokerFactory = getMockedBrokerFactoryWithBrokersSetup();
        DbConn conn = mock(DbConn.class);
        service.init(conn, brokerFactory);
        try { 
            service.execute(); 
        } catch (ExceptionClass ex) { 
            fail("Should not throw"); 
        }
    }
    
    private BrokerFactory getMockedBrokerFactory() {
        SeasonBroker seasonBroker = mock(SeasonBroker.class);
        BrokerFactory brokerFactory = mock(BrokerFactory.class);
        when(brokerFactory.getSeasonFactory()).thenReturn(seasonBroker);
        return brokerFactory;
    }
    
    private BrokerFactory getMockedBrokerFactoryWithBrokersSetup() { 
        BrokerFactory brokerFactory = getMockedBrokerFactory();
        Seasons season = mock(Seasons.class);
        SeasonBroker seasonBroker = mock(SeasonBroker.class);
        when(seasonBroker.findById(1)).thenReturn(season);
        return brokerFactory;
    }
}
