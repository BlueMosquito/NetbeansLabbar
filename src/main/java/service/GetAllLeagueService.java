/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Leagues;
import factory.BrokerFactory;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllLeagueService {

    private DbConn dbConn;
    private BrokerFactory brokerFactory;
    long leagueId;

    public GetAllLeagueService() {
    }

    public void init(DbConn dbConn, BrokerFactory brokerFactory) {
        this.dbConn = dbConn;
        this.brokerFactory = brokerFactory;
    }

    public List<Leagues> execute() {
        this.dbConn.open();
        List<Leagues> league = brokerFactory.getLeagueFactory().findAll();

        if (league == null) {
            System.out.println("Nothing there!!!");
        }
        
        this.dbConn.close();
        return league;
    }
}