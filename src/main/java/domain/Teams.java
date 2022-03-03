/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

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
}
