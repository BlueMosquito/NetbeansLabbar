/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Seasons;
import factory.BrokerFactory;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonService {
    private DbConn dbConn;
    private BrokerFactory brokerFactory;
    long seasonId;
    
    public GetAllSeasonService() {
    }
    
    public void init(DbConn dbConn, BrokerFactory brokerFactory){
        this.dbConn = dbConn;
        this.brokerFactory = brokerFactory;
    }

    public List<Seasons> execute() {
        
        this.dbConn.open();
        List<Seasons> season = brokerFactory.getSeasonFactory()
                .findAllSeasonByLeagueId(seasonId);
        
        if (season == null) {
            System.out.println("Nothing there!!!");
        }
        this.dbConn.close();
        return season;
    }
}
