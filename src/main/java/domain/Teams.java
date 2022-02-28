/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.teamsRecord;

/**
 *
 * @author hamednajafi
 */
public class Teams {
    
    private final teamsRecord theR;
    
    public Teams(){
        this(new teamsRecord());
    }
    
    public Teams(teamsRecord theR){
        this.theR = theR;
    }
    
    public Integer getGameId(){
        return theR.getInteger("g_id");
    }
    public String getTeamName(){
        return theR.getString("teamName");
    }
}
