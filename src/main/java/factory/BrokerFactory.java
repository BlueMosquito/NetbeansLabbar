/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import broker.GameBroker;
import broker.InformationBroker;
import broker.LeagueBroker;
import broker.SeasonBroker;
import broker.TeamBroker;

/**
 *
 * @author hamednajafi
 */
public class BrokerFactory {
    LeagueBroker leagueBroker;
    SeasonBroker seasonBroker;
    GameBroker gameBroker;
    TeamBroker teamBroker;
    InformationBroker informationBrooker;
    
    public LeagueBroker getLeagueFactory(){
        return leagueBroker = new LeagueBroker();   
    }
    
    public SeasonBroker getSeasonFactory(){
        return seasonBroker = new SeasonBroker();   
    }
    
    public GameBroker geGameFactory(){
        return gameBroker = new GameBroker();   
    }
    
    public TeamBroker getTeamFactory(){
        return teamBroker = new TeamBroker();   
    }
    
    public InformationBroker getInfoFactory(){
        return informationBrooker = new InformationBroker();   
    }
    
}
