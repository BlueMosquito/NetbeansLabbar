/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Informations;
import factory.BrokerFactory;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllArenaByGameIdService {
    
    long gameId;
    private DbConn dbConn;
    private BrokerFactory brokerFactory;

    public GetAllArenaByGameIdService(long gameId) {
        this.gameId = gameId;
    }
    
    public void init(DbConn dbConn, BrokerFactory brokerFactory) {
        this.dbConn = dbConn;
        this.brokerFactory = brokerFactory;
    }
    
    public Informations execute() {
        //Informations season = new Informations();
        //return season.getAllArenaById(gameId);
        
        this.dbConn.open();
        Informations info = brokerFactory.getInfoFactory().findById(gameId);

        if (info == null) {
            System.out.println("Nothing there!!!");
        }
        
        this.dbConn.close();
        return info;
    }
}
