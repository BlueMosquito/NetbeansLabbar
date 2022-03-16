/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Seasons;
import factory.BrokerFactory;

/**
 *
 * @author hamednajafi
 */
public class CreateNewSeasonService {
    
    private DbConn dbConn;
    private BrokerFactory brokerFactory;
    private final long leageId;
    private final String name;

    public CreateNewSeasonService(long leageId, String name) {
        this.leageId = leageId;
        this.name = name;
    }
    
    public void init(DbConn dbConn, BrokerFactory brokerFactory){
        this.dbConn = dbConn;
        this.brokerFactory = brokerFactory;
    }
    
    public Seasons execute(){
        
        this.dbConn.open();
        
        Seasons season = brokerFactory.getSeasonFactory()
                .createNewSeason(leageId, name);

        this.dbConn.close();
        return season;
    }
}
