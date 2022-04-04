/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package service;

import broker.InformationBroker;
import db.DbConn;
import domain.Informations;
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
public class GetAllArenaByGameIdServiceTest {
    
    public GetAllArenaByGameIdServiceTest() {
    }

    /**
     * Test of execute method, of class GetAllArenaByGameIdService.
     */
    @Test
    public void testShouldGetAllArena() {
        GetAllArenaByGameIdService service = new GetAllArenaByGameIdService(1);
        BrokerFactory brokerFactory = getMockedBrokerFactoryWithBrokersSetup();
        DbConn conn = mock(DbConn.class);
        service.init(brokerFactory);
        try { 
            service.execute(); 
        } catch (ExceptionClass ex) { 
            fail("Should not throw"); 
        }
    }
    
    private BrokerFactory getMockedBrokerFactory() {
        InformationBroker infoBroker = mock(InformationBroker.class);
        BrokerFactory brokerFactory = mock(BrokerFactory.class);
        when(brokerFactory.getInfoFactory()).thenReturn(infoBroker);
        return brokerFactory;
    }
    
    private BrokerFactory getMockedBrokerFactoryWithBrokersSetup() { 
        BrokerFactory brokerFactory = getMockedBrokerFactory();
        Informations info = mock(Informations.class);
        List<Informations> arenaList = info.getAllArenaById(1);
        InformationBroker infoBroker = mock(InformationBroker.class);
        when(infoBroker.findById(1)).thenReturn(info);
        return brokerFactory;
    }
    
}
