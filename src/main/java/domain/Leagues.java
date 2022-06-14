/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
       
    @JsonIgnore
    public String getName(){
        return theR.getString("leagueName");
    }
    
    @JsonIgnore
    public List<Leagues> getAllLeagues(){
        List<LeaguesRecord> leaguesRecordList = LeaguesRecord.findAll();
        return leaguesRecordList.stream().map((r)-> new Leagues(r)).collect(Collectors.toList());
        
        //List<LeagueRecord> leagueRecordList = LeagueRecord.findAll();
        //return leagueRecordList.stream().map((r)-> new League(r)).collect(Collectors.toList());
    }
    
}