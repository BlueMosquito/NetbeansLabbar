/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import java.util.stream.Collectors;
import records.LeaguesRecord;

/**
 *
 * @author hamednajafi
 */

public class Leagues {
    
    String leagueName;
    int leagueId;
    
    private final LeaguesRecord theR;
    
    public Leagues(){
        this(new LeaguesRecord());
        
    }
    
    public Leagues(LeaguesRecord theR){
        this.theR = theR;
        
    }
            
    public String getName(){
        return theR.getString("leagueName");
    }
    
    public List<Leagues> getAllLeagues(){
        List<LeaguesRecord> leaguesRecordList = LeaguesRecord.findAll();
        return leaguesRecordList.stream().map((r)-> new Leagues(r)).collect(Collectors.toList());
    }
    
}