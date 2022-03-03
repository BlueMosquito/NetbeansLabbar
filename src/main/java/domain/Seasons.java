/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.SeasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class Seasons {
    
    private final SeasonsRecord theR;
    
    public Seasons(){
        this(new SeasonsRecord());
    }
    
    public Seasons(SeasonsRecord theR){
        this.theR = theR;
    }
    
    public String getName(){
        return theR.getString("seasonName");
    }
    
    public Integer getLeagueId(){
        return theR.getInteger("league_id");
    }
    
}
