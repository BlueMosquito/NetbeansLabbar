/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import java.util.stream.Collectors;
import records.TeamsRecord;

/**
 *
 * @author hamednajafi
 */
public class Teams {
    
    private final TeamsRecord theR;
    
    public Teams(){
        this(new TeamsRecord());
    }
    
    public Teams(TeamsRecord theR){
        this.theR = theR;
    }
    
    public Integer getGameId(){
        return theR.getInteger("g_id");
    }
    public String getTeamName(){
        return theR.getString("teamName");
    }
    
    public List <Teams> getAllTeams(){
        List<TeamsRecord> teamRecordList = TeamsRecord.findAll();
        return teamRecordList.stream().map((r)-> new Teams(r)).collect(Collectors.toList());
    }
}
