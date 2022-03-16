/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package service;

import broker.LeagueBroker;
import db.DbConn;
import domain.Leagues;
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
public class GetAllLeagueServiceTest {
    
    public GetAllLeagueServiceTest() {
    } 
    
    /**
     * Test of execute method, of class GetAllLeagueService.
     */
    @Test
    public void testshouldAcceptExistingLeague() {
        GetAllLeagueService service = new GetAllLeagueService();
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
        LeagueBroker leagueBroker = mock(LeagueBroker.class);
        BrokerFactory brokerFactory = mock(BrokerFactory.class);
        when(brokerFactory.getLeagueFactory()).thenReturn(leagueBroker);
        return brokerFactory;
    }
    
    private BrokerFactory getMockedBrokerFactoryWithBrokersSetup() { 
        BrokerFactory brokerFactory = getMockedBrokerFactory();
        Leagues league = mock(Leagues.class);
        LeagueBroker leagueBroker = mock(LeagueBroker.class);
        when(leagueBroker.findById(1)).thenReturn(league);
        return brokerFactory;
    }
    
}
