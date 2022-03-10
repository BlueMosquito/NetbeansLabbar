/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Leagues;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllLeagueService {
    public List<Leagues> execute(){
        Leagues league = new Leagues();
        return league.getAllLeagues();
    }
    
    public void init(DbConn dbConn, BrokerFactory brokerFactory){
        
    }
}
