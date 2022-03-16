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
public class GetAllSeasonByLeagueIdService {
    
    private DbConn dbConn;
    private BrokerFactory brokerFactory;
    long leagueId;

    public GetAllSeasonByLeagueIdService(long leagueId) {
        this.leagueId = leagueId;
    }
    
    public void init(DbConn dbConn, BrokerFactory brokerFactory){
        this.dbConn = dbConn;
        this.brokerFactory = brokerFactory;
    }
    
    public List<Seasons> execute() {
        
        //Seasons season = new Seasons();
        //return season.getSeasonsById(seasonId);
        
        this.dbConn.open();
        List<Seasons> season = brokerFactory.getSeasonFactory()
                .findAllSeasonByLeagueId(leagueId);
        //if(league == null){    
        //}
        //List<Leagues> result = brokerFactory.getLeagueFactory().findAll();
        this.dbConn.close();
        return season;
    }
}
